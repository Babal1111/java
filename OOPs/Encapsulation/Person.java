
class PersonInfo {

    private  String name;
    private  String country;
    private  int age;
    // public Person(String name,int age,String country){
    //     this.name =name;
    //     this.age = age;
    //     this.country = country;

    // }
    void getter() {
        System.out.println(name + " " + age + " " + country);
    }

    void setter(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;

    }
}

public class Person {

    public static void main(String[] args) {

        PersonInfo ref = new PersonInfo();
        ref.setter("babal", 22, "india");
        ref.getter();

    }

}
