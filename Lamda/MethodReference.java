
import java.util.Arrays;
import java.util.List;




@FunctionalInterface
interface F1{
    int add(int a,int b);
}

public  class MethodReference{
    public static void main(String[] args) {
        F1 obj1 = (a,b)->a+b;
        System.out.println("Using lamda exp :"+obj1.add(20, 30));

        F1 obj2 = Integer :: sum;
        System.out.println("Using method reference : "+obj2.add(10, 30));

        List<String> names = Arrays.asList("babal","Preet","Singh");
        names.forEach(nam->System.out.println(nam+" "));
        System.out.println("");
        
    }
}