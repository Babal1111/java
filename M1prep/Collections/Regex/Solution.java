
public import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) {

        String[] records = {
            "R001-John-MATH=85",
            "R001-John-SCI=90",
            "R002-Mary-MATH=105",
            "R002-Mary-ENG=78",
            "R003-Alex-SCI=abc"
        };

        ReportCardParser parser = new ReportCardParser();
        MarksProcessor processor = new MarksProcessor();

        for (String record : records) {
            ParsedRecord parsed = parser.parse(record);
            processor.process(parsed);
        }

        System.out.println("Final Report:");
        for (Student s : processor.getStudents()) {
            System.out.println(s.getRollNo() + " (" + s.getName() + ") -> Total Marks: " + s.getTotalMarks());
        }
    }
}

class Student {

    private String rollNo;
    private String name;
    private int totalMarks;

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.totalMarks = 0;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void addMarks(int marks) {
        totalMarks += marks;
    }
}

class ParsedRecord {
    private String rollNo;
    private String name;
    private int marks;

    public ParsedRecord(String rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class ReportCardParser {

    private Pattern pattern = Pattern.compile("^R\\d{3}-[A-Za-z]+-[A-Z]+=\\d+$");

    public ParsedRecord parse(String record) {

        if (record == null || !pattern.matcher(record).matches()) {
            return null;
        }

        String[] parts = record.split("-");
        String rollNo = parts[0];
        String name = parts[1];

        String[] subjectMarks = parts[2].split("=");
        int marks;

        try {
            marks = Integer.parseInt(subjectMarks[1]);
        } catch (NumberFormatException e) {
            return null;
        }

        if (marks < 0 || marks > 100) {
            return null;
        }

        return new ParsedRecord(rollNo, name, marks);
    }
}

class MarksProcessor {

    private Map<String, Student> studentMap;

    public MarksProcessor() {
        studentMap = new HashMap<>();
    }

    public void process(ParsedRecord record) {
        if (record == null) {
            return;
        }

        Student student = studentMap.get(record.getRollNo());

        if (student == null) {
            student = new Student(record.getRollNo(), record.getName());
            studentMap.put(record.getRollNo(), student);
        }

        student.addMarks(record.getMarks());
    }

    public Collection<Student> getStudents() {
        return studentMap.values();
    }
}
 
