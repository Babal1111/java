


class Father{
    public static void test(int a){
        System.out.println("In FTHER function");
    }
}

class Son extends Father{

    public static void test(int a){
        System.out.println("Inn SON function");
    }
}
public class  Downcasting{

    public static void main(String[] args) {
        
        Son s1 = new Son();
        s1.test(1);

        Father s2 = new Father();

        s2.test(1);
Father S3 = new Son();

    }
}