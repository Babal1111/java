public class P2{
    
    public static void main(String[] args) {
        System.err.println("---------------- \\\\d --------------");

        System.out.println("5".matches("\\d"));
        System.out.println("0".matches("\\d"));
        System.out.println("a".matches("\\d"));
        System.out.println("12".matches("\\d"));
        System.out.println("12.4".matches("\\d"));
        
        System.err.println("---------------- \\\\w --------------");

        System.out.println("");
        
        System.out.println("a".matches("\\w"));
        System.out.println("0".matches("\\w"));
        System.out.println("B".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println("Ab".matches("\\w"));       
        System.out.println("1.1".matches("\\w"));

        System.err.println("---------------- \\\\s --------------");
        System.err.println("".matches("\\s")); 
        System.err.println(" ".matches("\\s"));             
        System.err.println("\t".matches("\\s"));       
        System.err.println("\n".matches("\\s"));       
        System.err.println("a".matches("\\s"));       
        System.err.println("1".matches("\\s"));       


    }
}