
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorr{
    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        List<Integer> li = new ArrayList<Integer>();
        for(int i: a)li.add(i);
        Iterator<Integer> itr = li.iterator();
        System.out.println(itr);
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());

        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        // System.out.println(itr.next());
        itr = li.iterator();
        System.out.println("Printing using while loop (itr reset) ");
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
            // System.out.println(itr.next());
            System.out.println(li);
        }

    }
}