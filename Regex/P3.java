public class P3{
    public static void main(String[] args) {
        
        System.out.println("A".matches("[A-Z]"));
        System.out.println("AA".matches("[A-Z]"));
        System.out.println("a".matches("[A-Z]"));
        System.out.println("1".matches("[A-Z]"));
        System.out.println("@".matches("[A-Z]"));
        //similar with "[a-z]"
        System.out.println("");
        System.out.println("abc".matches("abc"));
        System.out.println("Abc".matches("abc"));



    }
}