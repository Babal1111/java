class Prime{

    public static void main(String[] args) {
        

        System.out.println("All odd number's factorial from 1 to 10");
        for(int i=1;i<10;i++){
            int fact =1;
            if(i%2 != 0){
                for(int j=1;j<=i;j++){
                    fact*=j;
                }
                System.out.println(" The fact of "+i+" is : "+fact);
            }
        }
        System.out.println("\n ------factorial of prime no from 14 to 5 ---------------   \n");
        
        int fact;
        for(int i=14;i>=5;i--){
            boolean prime = true;
            for(int j=2;j<Math.sqrt(i);j++){
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                fact =1;
                for(int j=1;j<=i;j++){
                    fact*=j;
                }
                System.out.println(" Factorial of "+i+" is : "+fact);
            }
        }

        ///fibbonachii
        // int f= 5;
        // if(f==1 || f==2){
        //     System.out.println(" 0 1 ");
        // }
        // int sum = 0,prev=1;
        // for(int i=1;i<=f;f++){
        //     sum = sum+ prev;
        //     prev = sum;

        // }

    }
}