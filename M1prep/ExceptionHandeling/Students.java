package ExceptionHandeling;


class Student {
    private int rollNo;
    private String name;
    private int[] marks;

    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }
}

class ResultProcessor {

    public void processResult(Student student) throws InvalidMarksException {

        if (student == null) {
            throw new InvalidMarksException("Invalid student data.");
        }

        int[] marks = student.getMarks();

        if (marks == null || marks.length != 5) {
            throw new InvalidMarksException("Invalid marks data.");
        }

        int total = 0;
        boolean fail = false;

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100.");
            }
            if (mark < 40) {
                fail = true;
            }
            total += mark;
        }

        double percentage = total / 5.0;

        System.out.println("Processing result for " + student.getName() + "...");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (fail) {
            System.out.println("Result Status: FAIL");
            System.out.println("Reason: Minimum 40 marks required in each subject.");
        } else {
            System.out.println("Result Status: PASS");
        }
    }
}
class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);
    }
}

public class Students {
    public static void main(String[] args) {

        int[] marks = {80, 90, 35, 70, 85};
        Student student = new Student(101, "Rahul", marks);

        ResultProcessor processor = new ResultProcessor();

        try {
            processor.processResult(student);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}

