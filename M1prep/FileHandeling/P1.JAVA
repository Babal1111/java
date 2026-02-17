import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) {

        try {
            File file = new File("sample.txt");

            FileWriter writer = new FileWriter(file);
            writer.write("This is a sample text");
            writer.close();

            FileReader reader = new FileReader(file);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
