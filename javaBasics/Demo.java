import java.util.*;
class Demo {
public static void main(String[] args) {
    int a;
    a=10001;
    byte b=-128;
    System.out.println(b);
    System.out.println(a);
    
    short a1= 32767; //last or max val of short
    // short a2 = 32768;
    System.out.println(a1);
    // System.out.println(a2);

    // int b1 = 9417830863; // out of range for integer
    // System.out.println(b1);

    long l = 1010101011;
    System.out.println(l);
    
    char c = 'a';
    System.out.println(c);
    
    // swapping two int without using a third var;

    int c1= 10;
    int c2 =20;
    int c3;

    c3 = c2;
    c2 = c1;
    c1 = c3;

    System.out.println(c1+" "+c2);

    c1= 10;
    c2 =20;


    System.out.println(c1+" "+c2);

    c1= 10;
    c2 =20;
    c3=30;
    int sum = c1+c2+c3;
    int avg = sum/3;
    System.out.println("the sum of three nums is: "+sum+" avg of three nums :"+avg);


// swapp 2 num without 3rd20
    int x1=10;
    int x2=20;
    x1 = x1+x2;
    
    x2 = x1-x2;
    x1 = x1 - x2;
    System.out.println("swapped numbers are "+x1+" "+x2);  


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter x : ");
    int x = sc.nextInt();

    if(x%2==0){
        System.out.print("x is even");
    }else{
        System.out.print("x is odd");

    }


    

    







}
}