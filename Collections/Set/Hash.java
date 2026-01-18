
import java.util.HashSet;
import java.util.Set;

class  Hash{
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(10);
        s.add(null);
        s.add("babal");
        for (Object obj : s ){     
        System.out.println(obj);
        }
    }
}