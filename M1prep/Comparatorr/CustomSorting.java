import java.util.*;
public class CustomSorting {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<> (Arrays.asList("Babal","preet","Singh","122345","a"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<String>(){
                    public int compare(String str1, String str2){
                        
                        return str1.length()-str2.length();
                    }
                }
                    
                );
        System.out.println(list);

    }
}
