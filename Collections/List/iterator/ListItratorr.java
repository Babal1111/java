
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListItratorr{

    public static void main(String[] args) {
        String a[] = {"Babal","Preet","Singh","Jaggi"};
        List<String> li= new ArrayList<String>();

        for(String str:a) li.add(str);
        ListIterator itr = li.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        System.out.println("------------  backward -----------------");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        // remove from back
        while (itr.hasNext()) {
            itr.next();            
        }

        while (itr.hasPrevious()) {
            System.out.println(li);
            itr.remove();
            itr.previous();
        }

    }
}