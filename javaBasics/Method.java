

public  class Method{
    public static void foo(){
        System.out.println("THis is foo");
   
    }
    static void fibbo(int n){
        int first =0,second=1;
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
        System.out.println();
    }
    static void add(int a, int b){
        System.out.println("add : "+(a+b));
    }
    static void add(int a, int b,int c){
        System.out.println("add : "+(a+b+c));
    }
    static void mul(int a, int b,int c){
        System.out.println("Mul : "+(a*b*c));
    }
    static void prime(int n){
        boolean prime = true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                prime= false;
                System.out.println(n+ " Not a Prime");
                break;
            }
        }
        if(prime) System.out.println(n+ " Prime");

    }

    static  void reverse(int n){
        int rev=0;
        while(n>0){
        int rem = n%10;
        rev= rev*10+rem;
        n=n/10;
    }
    System.out.println(" Reverse of "+n+" is "+rev);
    }

    static void min(int a, int b,int c){
        if(a>b && a>c){
           System.out.println(a+" Is minimum"); 
        }else if(b>c && b>a){
            System.out.println(b+" Is minimum");
        }else{
            System.out.println(c+" Is minimum");
        }
    }
    static void max(int a, int b,int c){
        if(a<b && a<c){
           System.out.println(a+" Is maximum"); 
        }else if(b<c && b<a){
            System.out.println(b+" Is maximum");
        }else{
            System.out.println(c+" Is maximum");
        }
    }

    static boolean  isFibbo(int n){
        int first = 0,second = 1;
        int fibb=0;
        if(n==0|| n==1){
            return true;
        }
        for(int i=2;i<=n;i++){
            fibb = first+second;
            if(fibb==n) return true;
            first = second;
            second = fibb;
        }


        return false;
    }

    public static void main(String[] args) {
        // public static void func(){
        //     System.out.println("hii");
        // }
        add(10,20,30);
        mul(10,20,30);
        add(100,200);
        min(10,20,30);
        max(10,20,30);
        prime(45);
        fibbo(8);
        reverse(1234);
        int x =80;
        if(isFibbo(x)){
            System.out.println(x+ " is a part of fibbo");
        }else{
            System.out.println(x+ " is not a part of fibbo");
     
        }

        

    }
}