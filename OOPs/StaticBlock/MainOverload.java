public class MainOverload{

    public static void main(String[] args) {
        System.out.println("This is main argument 1st");
        A.main(args);

    }    
    
    public static void main(String[] args,String args2[]) {
        System.out.println("This is main argument 2nd");
    }
}

class A extends MainOverload{

    public static void main(String[] args) {
        System.out.println("Main methos of inherted class");
    }

}