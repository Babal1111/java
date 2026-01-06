class Demo{

    public Demo() {

        System.out.println("This is constructor");
    }    
    static{
        System.out.println("Hi this is Static-block");
    }
    {
        System.out.println("This is Instance initialiser ");
    }
    void display(){
        System.out.println("non-static method named \"display\" ");
    }
    static void staticMethodOne(){
                System.out.println("Static methodOne");
    }
    static void staticMethodTwo(){
                System.out.println("Static methodTwo");
                
    }

    public static void main(String[] args) {

        //staticMethodOne();
        Demo.staticMethodOne();
        Demo.staticMethodTwo();
        Demo ref1 = new Demo();
        ref1.display();

    }
}