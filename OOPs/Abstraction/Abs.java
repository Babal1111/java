
abstract  class Father{

    abstract public void test();
    abstract public int add(int a,int b);

}

class Son extends Father{
    @Override
    public void test(){
        System.out.println("Test method pf son class");

    }
    @Override
    public int add(int a,int b){

        return a+b;
    }
    
}


public class Abs{
    public static void main(String args[]){

        Father f1 = new Son();
        f1.test();

        
        // Son s1 = new Son();
        // s1.test();

        Son s2 = (Son) f1;
        
    }
}