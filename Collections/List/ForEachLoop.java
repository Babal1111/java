import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop{

    public static void main(String[] args) {
        String[] s = {"mridul","Girish","Pawan"};
    List<String> al = new ArrayList<String>();

    for(String name : s){
        al.add(name);
    }  

    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the name u want to check :");
    String nam = sc.nextLine();

    if(!al.contains(nam))System.out.println(nam+" Not present");
    else{
        System.out.println("Present at index "+al.indexOf(nam));
    }
    }
  

}