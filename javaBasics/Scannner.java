import java.util.Scanner;
public class Scannner {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
       char c = sc.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Not a Vowel");
        }

        char d = sc.next().charAt(0);
        if(d>='0' && d<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Not a digit");
        }


        // check the given char is uppercase or lowercase, digit or special character
        System.out.println("Enter a cahr to chaeck  uppercase or lowercase, digit or special character :");
        char c1  = sc.next().charAt(0);
        if(c1>='0' && c1<='9'){
            System.out.println("Digit");
        }
        else if(c1>='a' && c1<='z'){
            System.out.println("Lowercase char");
        }
        else if(c1>='A' && c1<='Z'){
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Special char");
        }


        System.out.print("Enter the marks to check the grade : ");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=75){
            System.out.println("Grade B");
        }
        else if(marks>=60){
            System.out.println("Grade C");
        }
        else if(marks>=40){
            System.out.println("Grade D");
        }   
        else{
            System.out.println("Fail");
        }


        System.out.print("Uppercase vowel or lowercase vowel , uppercase consonant or lowercase consonant : ");
        char ch = sc.next().charAt(0);
        if(ch =='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Uppercase Vowel");
        }
        else if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Lowercase Vowel");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase Consonant");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lowercase Consonant");
        }
        else{
            System.out.println("Not an alphabet");
        }

        /// to find maximum between three numbers
        int a = 10,b=20;
        c=30;
        if(a>b && a>c){
            System.out.println("A is grater");
        }
        else if( b>c && b>a){
            System.out.println("B is grater");
        }
        else{
            System.out.println("C is grater");
        }

}
}
