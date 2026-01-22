
// Q1. Write a regular expression to validate a mobile number with the following rules:
// 	Must start with 6, 7, 8, or 9
// 	Must contain exactly 10 digits
// Q2. Write a regular expression to validate an email ID with the following conditions:
// 	Username part can contain:
// 	letters (a–z, A–Z)
// 	digits (0–9)
// 	special characters: . _ % + -
// 	Must contain @
// 	Domain name should contain only letters
// 	Extension should contain at least 2 letters
	
// Q3. Write a regular expression to validate a password with the following rules:
// 	Minimum 8 characters
// 	Must contain at least one uppercase letter
// 	Must contain at least one digit
	
// Q4. Write a regular expression to validate a username with these rules:
// 	Must start with a letter
// 	Can contain letters, digits, and underscore (_)
// 	Length should be between 5 and 15 characters
	
// Q5. OTP and PIN Code Validation
// 	(a) OTP Validation
// 	Write a regular expression to validate a 6-digit OTP.
// 	(b) PIN Code Validation
// 	Write a regular expression to validate a 4-digit PIN.
	
// Q6. Write a regular expression to validate an Indian vehicle number in the following format:MH12AB1234

// Q7. Write a regular expression to validate a date in the format: dd-mm-yyyy

public class ImpQuestion{
    public static void  phoneCheck(String str){

        // if(str.length() == 10 && str.matches("^6|^8|^9|^7")) return true; doesnt check all arw digits
        if(str.length() == 10 && str.matches("^[6-9][0-9]{9}$")){
            System.out.println(str+ " is a valid phn no ");
        }
        else{
            System.out.println(str+ " is an invalid!! valid phn no ");
 
        }
    }
    public static void emailCheck(String str){
        if(str.matches("^[A-Za-z0-9.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")){
            System.out.println(str+ " is a valid email");
        }
        else{
            System.out.println(str+ " is an INVALID **  email");
        }
    }
    public static void main(String[] args) {
        String phn1 = "9874563210";
        String phn2 = "1874563210";
        String phn3 = "987456320";
        String phn4 = "6874563210";

        phoneCheck(phn1);
        phoneCheck(phn2);
        phoneCheck(phn3);
        phoneCheck(phn4);


        System.err.println("");
        emailCheck("babalpreet");
        emailCheck("babalpreet@gamil.com");
        emailCheck("babalpreet102@gmail.co");
        emailCheck("babalpreet@gamil.c");
        emailCheck("@babalpreet@gamil.com");
        emailCheck("babalpreet102gamil.com");
        emailCheck("babalpreet102@gamilcom");


    }
}