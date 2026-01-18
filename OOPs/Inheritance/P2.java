


class Father{
    static int a = 10;
    public static void test(){
        System.out.println("Father class static method");
    }

    {
        System.out.println("IIB of Father class");
    }
    public  Father(){
        System.out.println("Constructor of FATHER ");
    }
}

class Son extends Father{
    static int b = 20;
    public static void demo(){
        System.out.println("Son class static method");
    }
     {
        System.out.println("IIB son class");
    }
    public  Son(){
        System.out.println("Constructor of SON ");
    }
}




public class P2{
    static {
        System.out.println("SIB Driver Class");
    }

    public static void main(String[] args) {
        System.out.println("Main start");
        Son s1 = new Son();
        System.out.println("Main end ");
    }

}