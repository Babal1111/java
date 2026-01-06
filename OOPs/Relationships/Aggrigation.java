class Address{

    String city,state;

    public Address(String city,String state){
        this.city = city;
        this.state = state;

    }
}
class Student{
    int id,marks;
    String name;
    Address address;
    public Student(int id,int marks,String name, Address address){
        this.id = id;
        this.marks = marks;
        this.name = name;
        this.address = address;

    }
    public  void  display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
        System.out.println(address);

    }
}

public class Aggrigation{

public static void main(String[] args) {

        // Address ad = new Address("Jalandhar","Punjab");

        // Student s1 = new Student(101,75,"babal");

        // to aggrigate we ADD address in student

        Address ad = new Address("Jalandhar","Punjab");

        Student s1 = new Student(101,75,"babal",ad);
}

}

