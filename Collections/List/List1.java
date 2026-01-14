
import java.util.ArrayList;
import java.util.List;


public class List1{
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(10);
        l1.add(10.5);
        l1.add('a');
        l1.add("LPU");
        l1.add(false);
        System.out.println(l1);
        System.out.println(l1.size());

        l1.add(15);
        System.out.println(l1);
        l1.add("LPU");
        System.out.println(l1);
    }
}