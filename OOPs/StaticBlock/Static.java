class Static{
    static  int a = 10 ;

    static{
        System.out.println("Static method in main class ");
    }
    static void test(){
        System.out.println("TEst method in main class");
    }
    
    public static void main(String[] args) {
        
        int a = 200;
        System.out.println(a);
        test();
        A.test();
        System.out.println(Static.a);
    }

}

class A{


    static void test(){
        System.out.println("Test method in A class");
    }
    static {
        System.out.println("Static method in A class");
    }

    static void main(String[] args){
        System.out.println("Main method of A class");
    }

}