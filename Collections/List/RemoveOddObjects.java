import java.util.ArrayList;
import java.util.List;

public class RemoveOddObjects{
    public static void main(String[] args) {
        int a []= {1,2,3,4,5,6,7,8,9,9,10,11,12,13,14,15,16,17};
        List<Integer> li = new ArrayList<Integer>();

        for(int i:a){
            li.add(i);
        }
        for(int i:li){
            i=i+10;
            // if(i%2==1) li.remove(Integer.valueOf(i));
        }
        System.out.println(li);
        for(int i=0;i<li.size();i++){
            if(li.get(i)%2==1){ 
                li.remove(li.get(i));
                i--;
                }

            // if(li.get(i)%2==1){ 
            //     li.remove(i);
            //     i--;
            //     }

            //same li.get(i) returns the object present at that index, and remove, removes that object


        }
        System.out.println(li);

    }
}