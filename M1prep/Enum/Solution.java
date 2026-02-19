package Enum;

public class Solution{
    public static void main(String args[]){
        String input1 = "MORNING";
        String input2 = "NIGHT";
        Employee e1 = new Employee("E101","Rahul",ShiftType.valueOf(input1));
        Employee e2 = new Employee("E102","Anita",ShiftType.valueOf(input2));
        System.out.println(e1.getShiftInfo());   
        System.out.println(e2.getShiftInfo());   
    }
}
enum ShiftType{
    MORNING("09:00","17:00"),
    EVENING("22:00","06:00"),
    NIGHT("22:00","06:00");

     String startingTime;
     String endingTime;

     ShiftType(String startingTime,String endingTime){
        this.startingTime = startingTime;
        this.endingTime = endingTime;

     }

      
}
class Employee{
    String employeeId,employeeName;
    ShiftType shiftType;
    public Employee(String employeeId,String employeeName,ShiftType shiftType){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.shiftType = shiftType;
    }
    public String getShiftInfo(){
        return ("Employee "+employeeId+" works in "+shiftType.name()+" shift ("+shiftType.startingTime+
    " - "+shiftType.endingTime+")");
     
    }


}