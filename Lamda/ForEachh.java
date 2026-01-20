
import java.util.Arrays;
import java.util.List;


public  class ForEachh{
    public static void main(String[] args) {
        List<String> NameList = Arrays.asList("Babal","Preet","Ramu");
        List<Integer> numList = Arrays.asList(1,2,3,4,5,10,15,20,25,30);
        System.out.println("Printing using forEach (Lamda style): ");
        NameList.forEach(nam->System.out.print(nam+" "));
        System.err.println("");
        numList.forEach(num->System.out.print(num+" "));
        
        System.err.println("\nCondition(Even numbers) in Lamdatype forEach: ");
        numList.forEach(num->{
             if(num%2==0)System.out.print(num+" ");
        }
       );


    }
}