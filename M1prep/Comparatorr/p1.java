package M1prep.Comparatorr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class p1 {
    
    public static void main(String[] args) {
        Comparator<Integer> com  = new Comparator<Integer>(){
            
            public int compare(Integer i,Integer j){
                if(i%10 > j%10){
                    return  1;

                }else{
                    return 1;
                }
            }
            

    };

        List<Integer> li = Arrays.asList(11,32,19,45,17,26,35,21,57,30);

            Collections.sort(li.Int);
            System.out.println(li.int);
    }
}
