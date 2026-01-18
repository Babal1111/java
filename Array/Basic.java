


class  Basic{

    public static void main(String[] args) {
        
        int []arr = {1,2,3,4,5,6};
        for(int i=0;i<6;i++) System.out.println(arr[i]);

        // System.out.print("Enter the Size : ");
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr2[] = new int[size];
        // for(int i = 0;i<size;i++){
        //     arr2[i] = sc.nextInt();
        // }
        // System.out.println(" Arr 2 is : ");
        // for(int i=0;i<size;i++) System.out.println(arr2[i]);

        //print even , prime, perfect element
        int a[] = {1,2,3,4,5,16,7,8,12,13,14,17};   
        for(int i=0;i<a.length;i++) if(a[i]%2==0) System.out.print(a[i]+" ");   

        //prime
        for(int i=0;i<a.length;i++){
            boolean prime = true;
            for(int j =2;j<Math.sqrt(a[i]);j++){
                if(a[i]%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(a[i]+" - is prime");
            }
        }
        // 
        int max = a[0], secMax =0;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                secMax = max;
                max = a[i];
            }
            else if(a[i]>secMax) secMax= a[i];
        }
        System.out.println("The largest val is : "+max+" The secMAx is : "+secMax);

        max = a[0];
        secMax = a[1];
        int thirdMax = 0;
        for(int i=2;i<a.length;i++){
            if(a[i]>max){
                thirdMax = secMax;
                secMax = max;
                max = a[i];
            }
            else if(a[i]>secMax) secMax= a[i];
            else if(a[i]>thirdMax) thirdMax = a[i];
        }
        System.out.println("The largest val is : "+max+" The secMAx is : "+secMax+ " Third max is "+thirdMax);

        int b[] = {10,20,30,40,13,20,50,60};
         for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    System.out.println(" a , b meets at : "+a[i]);
                }
            }
         }
        int c[] = {10,20,30,10,40,13,20,50,60,80,20,30,60};
        int isUniq[]  = new int[c.length];
        for(int i=0;i<c.length-1;i++){
            boolean uniq = true;
            for(int j=i+1;j<c.length;j++){
                if(c[i] == c[j]){
                    uniq = false;
                    isUniq[i] = -1;
                    isUniq[j] =-1;
                    System.out.println("Duplicate found :"+c[i]);
                    break;
                }
            }
            if(uniq && isUniq[i]!=-1 ) System.out.println("          unique value : "+c[i] );
        }        




    }
}