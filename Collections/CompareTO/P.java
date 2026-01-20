import java.util.*;
public class P{
    public static void main(String args[]){
        List<Student> li = new ArrayList<>();
        li.add(new Student(101,"Alice",85));
        li.add(new Student(102,"Bob",72));
        li.add(new Student(103,"Charlie",90));
        li.add(new Student(104,"Diana",78));
        System.out.println("Students brfore sorting:");
        // System.out.println(li);
        for(Student student:li){
            System.out.println(student);
        }
        System.out.println("Students after sorting (by marks ascending):");
        Collections.sort(li);
        for(Student student:li){
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo,String name,double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public double getMArks(){
        return marks;
    }
    @Override
    public String toString(){
        return "RollNo: "+rollNo+", Name: "+name+", Marks: "+marks;
    }@Override
    public int compareTo(Student student){
        return (int)(this.marks - student.getMArks());
    }
}