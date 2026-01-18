

public  class Arithematic{
    public static void main(String[] args) {
        int a =10;
        int b=5;
        int c =0;


        try {
            System.err.println(" a/b : "+(a/b));
            System.err.println(" a/b : "+(a/c));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("handled in catch block");
        }
        finally{
            System.out.println("Finall block");
        }
    }
}