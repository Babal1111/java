class  MethodOverload{
    static void area(int s){
        System.out.println("The area of square is "+(s*s));
    }
    static void area(int s,int ss){
        System.out.println("The area of rect is "+(s*ss));
    }
    public static void main(String[] args) {
        area(10);
        area(10, 20);
    }
}