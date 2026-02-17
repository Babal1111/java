package MostImp;

 import java.io.*;
import java.util.*;

// -------------------- DigitalContent --------------------
abstract class DigitalContent {
    String contentId;
    String title;
    int maxAccessLimit;

    public DigitalContent(String contentId, String title, int maxAccessLimit) {
        this.contentId = contentId;
        this.title = title;
        this.maxAccessLimit = maxAccessLimit;
    }

    abstract public String getContentType();
}

// -------------------- EBook --------------------
class EBook extends DigitalContent {
    int pages;

    public EBook(String contentId, String title, int maxAccessLimit) {
        super(contentId, title, maxAccessLimit);
    }

    public String getContentType() {
        return "EBook";
    }
}

// -------------------- AudioBook --------------------
class AudioBook extends DigitalContent {
    double duration;

    public AudioBook(String contentId, String title, int maxAccessLimit) {
        super(contentId, title, maxAccessLimit);
    }

    public String getContentType() {
        return "AudioBook";
    }
}

// -------------------- License --------------------
class License {
    String licenseId;
    String userName;
    int accessCount;

    public License(String licenseId, String userName) {
        this.licenseId = licenseId;
        this.userName = userName;
        this.accessCount = 0;
    }

    public void incrementAccess() {
        accessCount++;
    }
}

// -------------------- AccessLog --------------------
class AccessLog {
    DigitalContent content;
    License license;
    String timeStamp;

    public AccessLog(DigitalContent content, License license, String timeStamp) {
        this.content = content;
        this.license = license;
        this.timeStamp = timeStamp;
    }
}

// -------------------- ContentFileHandler --------------------
class ContentFileHandler {
    String accessLogFile;

    public ContentFileHandler(String accessLogFile) {
        this.accessLogFile = accessLogFile;
    }

    public void logAccess(AccessLog log) {

        try (FileWriter fw = new FileWriter(accessLogFile, true)) {

            // increment license access count
            log.license.incrementAccess();

            // write contentId,userName
            fw.write(log.content.contentId + "," +
                    log.license.userName + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String[]> readAccessLogs() {

        List<String[]> logs = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(accessLogFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                logs.add(line.split(","));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return logs;
    }
}

// -------------------- PiracyDetector --------------------
class PiracyDetector {

    String reportFile;

    public PiracyDetector(String reportFile) {
        this.reportFile = reportFile;
    }

    public void analyzeAccessPatterns(List<String[]> logs,
                                      Map<String, DigitalContent> contentMap) {

        Map<String, Integer> userAccessCount = new HashMap<>();
        Map<String, Set<String>> contentUsers = new HashMap<>();

        for (String[] log : logs) {

            String contentId = log[0];
            String user = log[1];

            // count total accesses per user per content
            String key = user + "-" + contentId;
            userAccessCount.put(key,
                    userAccessCount.getOrDefault(key, 0) + 1);

            // track unique users per content
            contentUsers
                    .computeIfAbsent(contentId,
                            k -> new HashSet<>())
                    .add(user);
        }

        System.out.println("Piracy Report:");

        // ---- OVERUSE CHECK ----
        for (String key : userAccessCount.keySet()) {

            String[] parts = key.split("-");
            String user = parts[0];
            String contentId = parts[1];

            int count = userAccessCount.get(key);
            int limit = contentMap.get(contentId).maxAccessLimit;

            if (count > limit) {
                System.out.println("OVERUSE VIOLATION: "
                        + user + " exceeded limit for "
                        + contentId);
            }
        }

        // ---- PIRACY CHECK ----
        for (String contentId : contentUsers.keySet()) {

            if (contentUsers.get(contentId).size() > 1) {
                System.out.println("PIRACY ALERT: Multiple users accessed "
                        + contentId);
            }
        }
    }
}

// -------------------- Driver --------------------
public class OOPsAndFileHandeling {

    public static void main(String[] args) {

        // Clear previous log file
        try {
            new PrintWriter("accessLogs.txt").close();
        } catch (Exception e) {}

        // 1️⃣ Create Digital Content
        EBook ebook = new EBook("EB101", "Java Mastery", 3);
        AudioBook audioBook = new AudioBook("AB202", "Clean Code Audio", 2);

        // Store content in Map
        Map<String, DigitalContent> contentMap = new HashMap<>();
        contentMap.put("EB101", ebook);
        contentMap.put("AB202", audioBook);

        // 2️⃣ Create Licenses
        License alex = new License("L1", "Alex");
        License john = new License("L2", "John");

        // 3️⃣ File Handler
        ContentFileHandler handler = new ContentFileHandler("accessLogs.txt");

        // 4️⃣ Log Accesses
        handler.logAccess(new AccessLog(ebook, alex, "t1"));
        handler.logAccess(new AccessLog(ebook, alex, "t2"));
        handler.logAccess(new AccessLog(ebook, alex, "t3"));
        handler.logAccess(new AccessLog(ebook, alex, "t4"));  // exceeds limit
        handler.logAccess(new AccessLog(ebook, john, "t5"));  // different user

        // 5️⃣ Read Logs
        List<String[]> logs = handler.readAccessLogs();

        // 6️⃣ Detect Piracy
        PiracyDetector detector = new PiracyDetector("report.txt");
        detector.analyzeAccessPatterns(logs, contentMap);
    }
}
