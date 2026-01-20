
@FunctionalInterface
interface Factorial{
    int findFactorial(int n);
}

public class P2imp{
    public static void main(String[] args) {
        
        Factorial f1 = new Factorial(){

            @Override
            public  int findFactorial(int n){
                int fact =1;
                for(int i=1;i<=n;i++){
                    fact *=i;
                }
                return fact;
            }
        };

        System.out.println("The factorial of 5 using anonymus class = "+f1.findFactorial(5));

        Factorial f2 = (n)->{
            int fact =1;
                for(int i=1;i<=n;i++){
                    fact *=i;
                }
                return fact;
            
        };
        System.out.println("factoral using lamda exp : "+f2.findFactorial(5));
    }
}