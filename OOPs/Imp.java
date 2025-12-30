// class Imp{

//     int a = 10;

//     public void test() {

//         // non static -> object -> class static area
//         System.out.println("Test Start");
//         System.out.println("Directly : "+a);
//         System.out.println("With the help of this : "+ this.a);
//         System.out.println("Test End");
//         }
//     public static void main(String[] args) {
//         System.out.println("Main start");

//         Imp b = new Imp();
//         b.test();
//     }


// }



// how to use static members inside non-static context
    // Directly
    // eith help of classname 
    // with help of this variable

class  Imp{
    static int a =10; //static var
    public void test(){
         System.out.println("Test Start");
        System.out.println("Directly : "+a);
        System.out.println("With help of classname : "+Imp.a);

         System.out.println("With the help of this : "+ this.a);
         System.out.println("Test End");

    }
    public  static void main(String [] args){
         System.out.println("Main start");

         Imp b = new Imp();
         b.test();
    }
}