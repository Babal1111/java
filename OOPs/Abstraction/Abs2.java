abstract class Father{
    static int a = 10;
    int b = 20;
    public static void test(){
        System.out.println("Test method in father class");
    }
    public void demo(){
        System.out.println("non static method in father class");
    }

    abstract public void abs();

    static {
        System.out.println("Static intialiser block ");
    }
    {
        System.out.println("Instatnce initialiser block");
    }

    public  Father(){
        System.out.println("Constructor of Father");
    }
}

class Son extends Father{
    @Override
    public void abs(){
        System.out.println("overridien abstract method");
    }
}
public  class Abs2{
    public static void main(String[] args) {
        System.out.println("Main start");

        Father  ref
    }
}