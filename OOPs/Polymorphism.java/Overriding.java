
class Vehicle{
    static int x1 = 1;
    int x2 = 1;

    public void speedUp(int a){
        System.out.println("The speed of Vehicle is :"+a);

    }

}
class Car extends Vehicle{
    static int x1 = 2;
    int x2 = 2;
    public void speedUp(int a){
        System.out.println("The speed of Car is :"+a);
    }
}
class Cycle extends Vehicle{
    

    public void speedUp(int a){
        System.out.println("The speed of Cycle is :"+a);

    }
}

// class A1{
//     String s = "Class A1";
// }
// class B1 extends A1{
//     String s = "Class B1";
  
// }
public class Overriding{

    public static void main(String[] args) {
            
            Vehicle v1 = new Vehicle();
            v1.speedUp(100);

            Car c1 = new Car();
            c1.speedUp(110);

            Cycle y1 = new Cycle();
            y1.speedUp(10);

            Vehicle v2 = new Car();
            v2.speedUp(111);


            System.out.println(v2.x1);
            System.out.println(v2.x2);

            
            // A1 a1 = new B1();

        
    }


}