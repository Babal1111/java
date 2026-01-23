import java.util.*;

public class MethodReference2{
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,1,5,5,6,7);
        System.out.println("To Print all element one by one :");
        numList.stream().forEach(System.out::println);
        System.out.println("To Print only even element :");
        numList.stream().filter(n->n%2==0).forEach(System.out::println);
        


    }
}