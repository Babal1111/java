

class Father{
    static int a = 10;
    public static void test(){
        System.out.println("Father class static method");
    }

    static {
        System.out.println("SIB of Father class");
    }
}

class Son extends Father{
    static int b = 20;
    public static void demo(){
        System.out.println("Son class static method");
    }
    static {
        System.out.println("SIB son class");
    }
}




public class P{
    static {
        System.out.println("SIB Driver Class");
    }

    public static void main(String[] args) {
        System.out.println("Main start");
        Son s1 = new Son();
        System.out.println("Main end ");
    }

}