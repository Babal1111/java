
import java.util.Scanner;


public class AccentureQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n :");

        int n = sc.nextInt();
        // for(int i = 1;i<=a;i++){
        //     if(i%3==0 && i%5==0){
        //         System.out.println("FixxBuzz");
        //     }

        // }
        System.out.print(" The factors of "+n+ " are : ");
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\n Prime nos are:");

        // no of prime numbers

        for(int i = 2;i<=n;i++){
            boolean prime = true; 
            for(int j= 2;j<= Math.sqrt(i);j++){
                if(i!=j && i%j==0){
                    prime = false;
                    break;
                    // System.out.print(j+" ");
                }

            }
            if(prime){
                System.out.print(i+" ");
            }
        }


        // 8.5, 8.09 9.25 8.43 8.3, 9
        // 51.5

        // perfect numbers
        System.out.println("\n perfect numbers till 100 ");
        for(int i=1;i<=100;i++){
            int sum = 0;
            for(int j=1;j<i;j++){
                if(i%j == 0){
                    sum+=j;
                }
            }
            if(sum == i){
                System.out.print(i + " ");
            }
        }

        
        }
}