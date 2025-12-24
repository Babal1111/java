import java.util.Scanner;

public class SpecialNumbers{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // abun no , sum of its all fact > num
    System.out.println("\n\n ---------------- Abundant number ------------------- ");
    System.out.print("Enter a num to check if its Abundant no : ");
    int x=sc.nextInt();
    int n=x;
    int sum=0;
    for(int i =1;i<n;i++){
        if(n%i==0) sum+=i;
    }
    if(sum > x) System.out.println(x+ " is an Abuidant no. ");
    else System.out.println(x+ " is not an Abuidant no. ");
    ////
    /// disarium number eg 175, 1^1 + 7^2 + 5^3 = 175 
    System.out.print("Enter a num to check if its Diarum no : ");
    x=sc.nextInt();
    n=x;
    sum=0;
    int count = 0; // no of digits
    while (n>0) { 
        count++;
        n/=10;
    }
    n=x;
    while (n>0){
        int rem = n%10;
        sum+= Math.pow(rem, count);
        count--;
        n/=10;
        
    }
    if(sum == x) System.out.println(x+ "is a disariym no ");
    else System.out.println(x+ " is not a disariym no ");
    }
}