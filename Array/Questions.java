
import java.util.Scanner;


public class Questions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int a= sc.nextInt();

        int arr[] = {10,20,30,40,40,50,60,10,20,80,-40,30};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j <arr.length; j++){  
                if(arr[i]+arr[j] == a) System.out.println(arr[i] + " + "+arr[j]);
            }
        }
        int sum =0,count=0;
        for (int idx = 0; idx < arr.length; idx++) {
            sum+=arr[idx];
            
        }
        int avg = (sum/arr.length)+1;
        System.err.println("The avg is : "+avg);
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]==avg)count++;
            
        }
        System.out.println(" The num of element equal to avg is : "+count);
        int max=0,min=0;
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]>max) max =arr[idx];
            if(arr[idx]<idx) min = arr[idx];
            
        }
        System.out.println("The avg of max and min "+max+" & "+min+" is : "+(max+min)/2);

        int arr2[] = {8,7,4,3,5,2};
        for (int idx = 0; idx < arr2.length-1; idx++) {
            boolean isLeader = true;
            for (int i = idx+1; i < arr2.length; i++) {
                if(arr2[idx]<arr2[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                System.out.println(arr2[idx]+" is Leader");
            }
        }
        System.out.println(arr2[arr2.length-1]+" is Leader");

        int arr3[] = {37,10,50,132,546,1234,1721242};
        for (int idx = 0; idx < arr3.length; idx++) {
            int x = arr3[idx],maxCount=0;
            max=0;
            count=0;
            while (x>0) {
                int rem = x%10;
                if(rem ==2)count++;
                x/=10;
                //maxCount = Math.max(maxCount, count);
            }
            System.out.println("The count of 2 in : "+arr3[idx]+" is "+count);
            if(count>maxCount) {
                maxCount = count;
                max = arr3[idx];
            }
        }
        System.out.println("Maximum count of 2 is in : "+max);
    }

}