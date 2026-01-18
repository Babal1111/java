
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RemoveDupes{
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>(Arrays.asList(10,20,30,40,10,20,30,null,50,70,80,90,60,10,100,100));
        Set<Integer> s = new HashSet<Integer>();

        for(Integer obj:al){
            s.add(obj);
        }
        for (Integer obj : s) {
            System.out.println(obj);
        }

    }
}