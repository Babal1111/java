class Level3{
    int a3 = 30;

}
class Level2 extends Level3{
    int a2=20;
} 
class Level1 extends Level2{
    int a1 = 10;

}

class Father{
    
}
public class Upcasting{
    public static void main(String[] args) {
        Level1 ref1 = new Level1();
        System.out.println(ref1.a1+" "+ref1.a2+" "+ref1.a3);

       // Level1 ref2 = new Level2();
        
        Level2 ref2 = new Level2();
        // System.out.println(ref2.a1);
        System.out.println(ref2.a3);

        Level2 ref3 = new Level1();
        System.out.println(ref3.a2);
        System.out.println(ref3.a3);

        // System.out.println(ref3.a1);



    }
}