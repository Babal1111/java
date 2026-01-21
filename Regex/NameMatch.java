
import java.util.Arrays;
import java.util.List;


class NameMatch{
    public static boolean check(String str){
        return str.matches("A*d*i*t*y*a*");
    }
    public static boolean check2(String str){
        return str.matches(".*");
    }
    public static boolean check3(String str){
// Hello World -> true
// Java 8 -> true
// User1 Name -> true
// Suraj Kumar -> true
// A B -> true
// Test Case -> true
// Hello -> false
// Java8 -> false
// 123 -> false
// HelloWorld -> false
//  Hello World -> false
// Hello  World -> false
       // return str.matches(".*|(Hello World)");
        return str.matches("[A-Z]*[a-z]*[0-9]* [A-Z]*[0-9]*[a-z]*$");
        
    }
    public static void main(String[] args) {
       //regex that shoud accept Aditya,AAAdddiiityaaa,Additttyya,dityaaa,Adtttyya

    //    System.out.println("Aditya".matches("A*d*i*t*y*a*")); 
    //    System.out.println("AAAdddiiityaaa".matches("A*d*i*t*y*a*")); 
    //    System.out.println("Additttyya".matches("A*d*i*t*y*a*")); 
    //    System.out.println("dityaaa".matches("A*d*i*t*y*a*")); 
    //    System.out.println("Adtttyya".matches("A*d*i*t*y*a*")); 

       List<String> li =   Arrays.asList("Aditya","AAAdddiiityaaa","Additttyya","dityaaa","Adtttyya");

       for(String str:li){
            System.out.println(str+" : "+check(str));
       }
        System.out.println("\n");
       
        List<String> l1 =   Arrays.asList("Suraj","SURAj","suraj","SuRaj","Suurajj","Suraj@123","S#u@j@123","123Suraj","12345");

        for(String str:l1){
            System.out.println(str+" : "+check2(str));
        }
        System.out.println("\n---------------check3------------------");
        List<String> l2 =   Arrays.asList("Hello World","Java 8","Suraj Kumar","A B","Test Case","Hello","Java8","123","HelloWorld","Hello  World"," Hello World");  
        for(String str:l2){
            System.out.println(str+" : "+check3(str));
        }    
       
    }
}