
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
        System.out.println("\n\nthe digts on even places are : ");
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


        /// SPECIAL NUMBER
        /// eg 19
        ///sum of digits 1+9 = 10
        ///prod of digits = 1*9 = 9
        ///total = sum+prod
        ///total = number ie special number
        System.out.print("\n Enter nuber to check it is special or not : ");
        x = sc.nextInt();
        n=x;
        int sum = 0,prod = 1;
        while (n>0) { 
            int rem = n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        if((sum+prod)==x){
            System.out.print(x+" is a special number");
        }
        else{
            System.out.print(x+" is NOT a special number");

        }

        System.out.println("\n\n ------------------- Special num from 1 to 100 -----------------\n");
        for(int i=1;i<=100;i++){
            n=i;
        sum = 0;
        prod = 1;
        while (n>0) { 
            int rem = n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        if((sum+prod)==i){
            System.out.print(i+" ");
        }
        }

        System.out.println("\n\n ------------ factorial of digits of number ------------ ");
        System.out.print("\n Enter nuber to check factorial of its digit & check if it is a STRONG no. : ");
        x = sc.nextInt();
        n= x;
        sum=0;
        while (n>0) {
            int rem = n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact*=i;
            } 
            sum+=fact;
            System.out.println(" Factorial of "+rem +" is : "+fact);
            n/=10;
            
        }
        if(sum == x) System.out.println("\n"+x+" is a strong number ");
        else  System.out.println("\n"+x+" is NOT a strong number ");

        System.out.println("\n------------------------ strong numbers from 0 to 1000  ---------------------------/n");
        for(int i=1;i<=1000;i++){
        n= i;
        sum=0;
        while (n>0) {
            int rem = n%10;
            int fact=1;
            for(int j=1;j<=rem;j++){
                fact*=j;
            } 
            sum+=fact;
            n/=10;
            
        }
        if(sum == i) System.out.println(i+" ");
        }

        // strong number - the dum of factorial of its digit is equal to the num itself
        // 145, fact 1-1,4-24,5-120, sum= 1+24+120, sum = 145

    System.out.print("\nEnter a no to check if it is palidrome: ");
    x = sc.nextInt();
    n=x;
    int rev=0;
    while(n>0){
        int rem = n%10;
        rev= rev*10+rem;
        n=n/10;
    }
    if(rev==x) System.out.println(x+" is a Palidrome ");
    else System.out.println(x+" is a NOT Palidrome ");



    }


}