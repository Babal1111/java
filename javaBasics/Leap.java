
import java.util.Scanner;
import javax.naming.NamingException;

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
        System.out.println("            ----------------------------------------------------------            ");

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

        System.out.println("            ----------------------------------------------------------            ");
        int n1,n2,n3,n4;
        char op;
        System.out.print(" How many number u want to give :");
        int num = sc.nextInt();

        switch (num) {
            case 2:
                System.out.print("Enter num 1: ");
                n1 = sc.nextInt();
                System.out.print("Enter num 2: ");
                n2 = sc.nextInt();
                System.out.print("Ente operator ie +,-,*,/ :");
                op = sc.next().charAt(0);
                switch (op) {
                    case '+':
                        System.out.println("The addition is : "+(n1+n2));
                        break;
                    case '-':
                        System.out.println("The Substraction is : "+(n1-n2));
                        break;
                    case '*':
                        System.out.println("The multiplication is : "+(n1*n2));
                        break;
                    case '/':
                        System.out.println("The  Division : "+(n1/n2));
                        break;
                    default:
                        System.out.println("Enter a valid operation");
                }
                break;
            case 3:
                System.out.print("Enter num 1: ");
                n1 = sc.nextInt();
                System.out.print("Enter num 2: ");
                n2 = sc.nextInt();
                System.out.print("Enter num 3: ");
                n3 = sc.nextInt();

                System.out.print("Ente operator ie +,-,*,/ :");
                op = sc.next().charAt(0);
                switch (op) {
                    case '+':
                        System.out.println("The addition is : "+(n1+n2+n3));
                        break;
                    case '-':
                        System.out.println("The Substraction is : "+(n1-n2-n3));
                        break;
                    case '*':
                        System.out.println("The multiplication is : "+(n1*n2*n3));
                        break;
                    case '/':
                        System.out.println("The  Division : "+(n1/n2/n3));
                        break;
                    default:
                        System.out.println("Enter a valid operation");
                }

                break;
            case 4:
                System.out.print("Enter num 1: ");
                n1 = sc.nextInt();
                System.out.print("Enter num 2: ");
                n2 = sc.nextInt();
                System.out.print("Enter num 3: ");
                n3 = sc.nextInt();
                System.out.print("Enter num 4: ");
                n4 = sc.nextInt();


                System.out.print("Ente operator ie +,-,*,/ :");
                op = sc.next().charAt(0);
                switch (op) {
                    case '+':
                        System.out.println("The addition is : "+(n1+n2+n3+n4));
                        break;
                    case '-':
                        System.out.println("The Substraction is : "+(n1-n2-n3-n4));
                        break;
                    case '*':
                        System.out.println("The multiplication is : "+(n1*n2*n3*n4));
                        break;
                    case '/':
                        System.out.println("The  Division : "+(n1/n2/n3/n4));
                        break;
                    default:
                        System.out.println("Enter a valid operation");
                }
                break;
            default:
                System.out.print("Thereshould be only 2 or 3 or 4 numbers");
        }

        
        System.out.println("            ----------------------------------------------------------            ");

        String shape;
        System.out.println("Enter the shape : ");
        shape = next();
        switch (dep) {
            case "circle":
                System.out.print("Enter raddi : ");
                int r = sc.nextInt();
                System.out.println("The area of circle is : "+ (r*3.14*r));
               
                break;
            case "Square":
                System.out.print("Enter side : ");
                int s = sc.nextInt();
                System.out.println("The area of Square is : "+ (s*s));
                break;
            case "Rectangle":
                System.out.print("Enter Length : ");
                int l = sc.nextInt();
                
                System.out.print("Enter Breadth : ");
                int b = sc.nextInt();
                System.out.println("The area of Square is : "+ (l*b));
                break;

            case "trianglr":
                System.out.print("Enter base : ");
                int base = sc.nextInt();
                System.out.println("Enter height: ");
                int height = sc.nextInt();
                System.out.println("The area of Square is : "+ (1/2 * base *height
                ));

                
                
                

                break;
            default:
                        System.out.println("Not a valid Shape");
        }



    }
      }
        