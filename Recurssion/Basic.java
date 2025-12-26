class Basic{

    static void foo(){
        System.out.println("foo");
        foo();
    }
    static void number(int n){
        if(n>1000){
            return;
        }
        System.out.print(n+ " ");
        number(n+1);
    }
    static void number1(int n){
        if(n>1000) return;
        System.out.println(n+" ");
        number1(n+1);
    }

    public static void main(String[] args) {
        // foo();
        // number(1);
        number1(500);
    }
}