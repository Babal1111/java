
import java.util.Scanner;

public class Leap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int a = sc.nextInt();
        if(a%400 == 0 || (a%4==0 && a%100!=0)){
            System.out.println("LEAP hai LEAP hai..........");
        }
        else{
            System.out.println("LEAP NAHI  hai");

        }

        System.out.print("Enter a fruit name: ");
        String fruit = sc.next();

        switch(fruit){
            case "mango":
                System.out.println("Mangos are tasty tasty");
                break;
            case "apple":
                System.out.println("Apples are Kashmiri ");
                break;

            default:
                System.out.println("Other fruits are not so tasty");
                
        }


    }
}