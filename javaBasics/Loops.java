
public class Loops{
    public static void main(String args[]){
        int a = -123;
        while(a>=-129){
            System.out.print(a+" ");
            a--;
        }
        System.out.println();
         a = 79;
        while(a<=84){
            System.out.print(a+" ");
            a++;
        }
        System.out.println("");

        a = 0;
        while(a>=-9){
            System.out.print(a+" ");
            a--;
        }
        System.out.println("");

        a=-110;
        while(a<=-100){
            System.out.print(a+" ");
            a++;
        }
        System.out.println("");

        char c = 'A';
        while(c<='M'){
            System.out.print(c+" ");
            c++;
        }
        System.out.println();
        c='X';
        while(c<='m'){
            System.out.print(c+" ");
            c++;

        }
        System.out.println();

        System.out.println("\n -------------  DO WHILE ------------------ \n");
        a = -111;
        do { 
            System.err.print(a+" ");
            a++;
        } while (a<=-101);
           System.out.println();

        c='s';
        do{
            System.out.print(c+" ");
            c--;
        }while(c>='l');
        System.out.println();
        c='T';
        do { 
            System.out.print(c+" ");
            c++;
        } while (c<='Z');

        System.out.println("\n ------------- FOR LOOP ------------------ \n");

        for(a =1111;a<=1121;a++){
            System.out.print(a+ " ");
        }   
        System.out.println();

        for(a =-1111;a>=-1121;a--){
            System.out.print(a+ " ");
        }   
        System.out.println();

        for(a = -1234;a<=-1223;a++){
            System.out.print(a+ " ");
        }   
        System.out.println();
        
        for(c ='d';c<='j';c++){
            System.out.print(c+ " ");
        }   
        System.out.println();
        for(c ='m';c>='e';c--){
            System.out.print(c+ " ");
        }   
        System.out.println();

        for(c ='r';c<='x';c++){
            System.out.print(c+ " ");
        }   
        System.out.println();

    }
}