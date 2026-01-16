import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Traversall{

    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();
        li.add(10);
        li.add(20);
        ListIterator<Integer> itr = li.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        

    }
}