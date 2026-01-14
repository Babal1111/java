
import java.util.ArrayList;
import java.util.List;
public class P1{


    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add("a");
        l1.add("b");
        System.out.println(l1);

        int n = l1.size();
        for (int i = 0; i < n; i++) {
            System.out.println(i+" Index, value : "+l1.get(i));
            
        }
        System.out.println("=----------------------cities----------------------------");
        List cities  = new ArrayList();
        cities.add("Delhi");

        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add(2,"Banglore");

        System.out.println(cities);
        if(cities.contains("Mumbai")){
            System.out.println("Mumbai exists");
        }
        else{
            System.out.println("Mumbai Doesnt exists");
        
        }
        // Collection.sort(cities);
        // cities.sort();
        

    List <Integer> l2 = new ArrayList<Integer>();
    l2.add(10);
    l2.add(5);
    l2.add(20);
    l2.add(15);
    l2.add(25);
    System.out.println(l2);
    if(l2.contains(15)){
        System.out.println("15 is present");
    }else{
        System.out.println("15 is not present");
    }

    // l2.remove(5);
    l2.remove(Integer.valueOf(5));//

    System.out.println(l2);

    }

}