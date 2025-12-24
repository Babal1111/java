import java.util.Scanner;

class  Fibbo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        
        // 0 1 1 2 3 5 8 13
        if(n==1){
            System.out.println("0");
        }
        else if (n==2){
            System.out.println("1");

        }
        else{
            System.out.print("0 1");
            for(int i = 2;i<n;i++){
                int sum = first+second;
                first = second;
                second = sum;
                System.out.print(" "+sum);

            }
        }
    }
}