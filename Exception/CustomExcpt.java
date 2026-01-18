
import java.util.Scanner;



class NotEligibleForVotingException extends Exception{

}
public class CustomExcpt{
        public static void main(String[] args) {
            System.out.println("main start");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            try {
                ageCheck(18);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
public static void ageCheck(int age) throws NotEligibleForVotingException{

    if(age>=19) System.out.println("Eligible for votiong");
    else{ throw new NotEligibleForVotingException();} // can pass here any ms also
    
}
}

