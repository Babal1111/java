package M1prep.ObectClass;

public   class Employee {
    int employeeId;
    String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj) return true;
       if(!(obj instanceof Employee)){
        return false;
       }
       Employee obj2 = (Employee) obj;
       if(this.employeeId== obj2.employeeId) return true;

       return false;

    }
}

public class  Equalss{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001, "Alice");
        Employee emp2 = new Employee(1001, "Bob");
        System.out.println(emp1.equals(emp2));
    }
}
 