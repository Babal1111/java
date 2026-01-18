

class Test{

    static int add(int arr[]){
        int sum=0;
        for (int idx = 0; idx < arr.length; idx++) {
            sum+=arr[idx];
            
        }
        return sum;
    }
    static int high(int arr[]){
        int max=0,maxIdx=0;
        for (int idx = 0; idx < arr.length; idx++) {
            if(max<arr[idx]){
                max = arr[idx];
                maxIdx = idx;
            }
           
    }
     return maxIdx;
    }

    static int low(int arr[]){
        int min=0,minIdx=0;
        for (int idx = 0; idx < arr.length; idx++) {
        if(min>arr[idx]){
                min = arr[idx];
                minIdx = idx;
            }
        }
            return minIdx;
    }
    // static void minMax(int arr[]){
    //     int max=0,min=0,maxIdx=0,minIdx=0;
    //     for (int idx = 0; idx < arr.length; idx++) {
    //         if(max<arr[idx]){
    //             max = arr[idx];
    //             maxIdx = idx;
    //         }
    //         if(min>arr[idx]){
    //             min = arr[idx];
    //             minIdx = idx;
    //         }
            
    //     }
    //     System.out.println("The Hottes temp was on : "+maxIdx+"\n The Coldest temperature is : "+minIdx);
    // }
    static int count(int arr[],int target){
        int count =0;
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]>target)count++;
            
        }
        return count;
    }

    static void update(int arr[],int val,int idx){
        arr[idx] = val;

    }

    static void Search(int arr[], int target){
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]==target){
                System.out.println("Target sales found on "+idx+" day");
            }
            
        }
    }

    static void print(int arr[]){
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]+" ");
            
        }
    }
    public static void main(String[] args) {
            int[] sales = {120, 80, 150, 90, 200, 75, 110};
            int[] temperatures = {32, 28, 31, 29, 35, 27, 30}; 
            
            //act 1
            int avg = add(temperatures)/sales.length;
            System.out.println("THe avg temp is : "+avg);

            //act2
            System.out.println("The hotest day was "+high(temperatures)+" with "+temperatures[high(temperatures)]+" degree");
            System.out.println("The cooldes day was "+low(temperatures)+" with "+temperatures[low(temperatures)]+" degree");

            //act3
            System.out.println("The number of hot days were : "+ count(temperatures, 30));

            //act4 
            System.out.println("The total sale :"+add(sales));
            System.out.println("Average sales : "+ (add(sales)/sales.length)); 

            //act5
            System.err.println("The highest sales were on" + high(sales)+ " sales were : "+ sales[high(sales)]);
            System.err.println("The highest sales were on" + low(sales)+ " sales were : "+ sales[low(sales)]);

            //act6 
            System.out.println("The no of high sales days was"+ count(sales, 100));

            //act7
            Search(sales, 150);

            //act 8 
            update(sales,9000000,2);

            print(sales);






    }
}