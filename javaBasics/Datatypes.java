public class Datatypes {
    public static void main(String args[]){
        // float a1 = 3.6f;
        // System.out.println("area : "+a1*a1);

        // int a = 16;
        // String ans = a%2==0? "EVEN" : "ODD";
        // System.out.println(ans);

        //prog to check wether the given number is even or odd by using only if 

        int x = 11;
        boolean eve = false;

        if(x%2==0){
            eve = true;
            System.out.println("EVEN");
        }
        if(!eve){
            System.out.println("odd");
        }

        int y = 10;
        if(y%5==0 && y%3==0){
            System.out.println("Divisible by both 3 and 5");
        }
        else{
            System.out.println("Not Divisible by both 3 and 5");
        }

        // the given char is vowel or consonant
        char ch = 'z';
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        // the given char is digit or not

        char c = 'a';
        if(){
            System.out.println("Digit");
        }
        else{
            System.out.println("Not a digit");
        }


    }
}
