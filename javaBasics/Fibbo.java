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
        else if (n==2 || n==3){
            System.out.println("1");

        }
    }
}