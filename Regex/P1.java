
public class P1{
    public static void main(String[] args) {
        System.out.println("Suraj".matches("S...j"));
        System.out.println("Suraj".matches("S..j"));
        System.out.println("Suraj".matches("s...j"));
        System.out.println("S123j".matches("S...j"));
        System.out.println("Sbbbj".matches("S...j"));

        ///
        System.out.println();
        
        System.out.println("Sabcj".matches("S+j"));
        System.out.println("SSbcj".matches("S+bcj"));
        System.out.println("SSSj".matches("S+j"));
        System.out.println("Ssbcj".matches("S+j"));
        System.out.println("Sjj".matches("S+j"));
        System.out.println("Sjj".matches("S+j+"));

        //
        System.out.println("*");
        System.out.println("j".matches("S*j"));
        System.out.println("Sj".matches("S*j"));
        System.out.println("SSj".matches("S*j"));
        System.out.println("cSabj".matches("S*j"));
        System.out.println("sSj".matches("S*j"));
        System.out.println("jj".matches("S*j"));

        //
        System.out.println("");
        System.out.println("colr".matches("colo?r"));
        System.out.println("color".matches("colo?r"));
        System.out.println("coloor".matches("colo?r"));
        System.out.println("col0r".matches("colo?r"));
        System.out.println("");
        System.out.println("ab".matches("ab(c)?"));
        System.out.println("abcd".matches("ab(c)?"));
        System.out.println("abcd".matches("ab(cd)?"));
        System.out.println("abc".matches("ab(cd)?"));
        System.out.println("ab".matches("ab(cd)?"));

        
        

    }
}