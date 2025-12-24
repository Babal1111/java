
import java.util.Scanner;


public class Digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int n =x;
        while(n>0){
            int rem = n%10;
            System.out.print(rem+" ");
            n=n/10;
        }
        // even digits of a num
        n=x;
        int count =0; //count of digits
        while(n>0){
            count++;
            n=n/10;
        }
        // System.out.println(" \n number of digits : "+count);
        n=x;
        System.out.println("\n the digts on even places are : ");
        boolean flag = true;
        if(count%2==0){ //even number of digits
        while(n>0){
            if(flag){
            int rem = n%10;
            System.out.print(rem+" ");
            flag = false;
            }
            else{
                flag = true;
            }
            n=n/10;
        }
             
        }else{ //odd num of digits

        while(n>0){

        if(flag){
            flag = false;
        }else{
            int rem = n%10;
            System.out.print(rem+" ");
            flag = true;
        }
            n=n/10;
        }
        }

        // find largest , second largest digits;

        System.out.print("\n ------------- ------------- ---------- \n Enter a number to find its largest and second largest digit: ");
        x = sc.nextInt();
        n = x;
        int max = 0, secMax = 0;

        while(n>0){
            int rem = n%10;
            if(rem> max){
                secMax = max;
                max = rem;
            }else if(rem>secMax){
                secMax = rem;

            }
            n=n/10;

        }
        System.out.print("\n The largest digit & second largest digits of this are : "+max+" "+secMax);



    }

}