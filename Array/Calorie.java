
import java.util.Scanner;

class Calorie{
    int steps = 0,weight=0;
    double totalCal=0;
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter steps taken :");
        steps = sc.nextInt();
        System.out.println("Enter Weight :");
        weight= sc.nextInt();


    }
    double  calc(int steps, int we){
        totalCal = Math.round(steps* we*0.4);
        return totalCal;
        
    }
    double  calc(int steps){
        double cal = Math.round(steps*0.4);
        return cal;
        
    }
    void summary(){
        System.out.println("Total calorie burnt is  : "+totalCal);
    }
    
    public static void main(String[] args) {
        input();
        System.out.println(" the Steps  & weight are : "+steps+" "+weight);
        System.out.println(" the cal burt with out weight : "+calc(steps));
        System.out.println(" the cal burt with  weight : "+calc(steps,weight));
        summary();
        
    }
}
