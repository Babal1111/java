

@FunctionalInterface
interface F1{
    void greeting();
}

interface F2{
    int add(int a,int b);
}

public  class P1{
    public static void main(String[] args) {
        //F1 obj1 = new F1(); // interfaces dont have coinstructor, so we need to write a anonymus class
        F1 obj1 = new F1(){
            @Override
            public  void greeting(){
                System.out.println("Hlo from annonoymus class");
            }
        };

        obj1.greeting();

        F1 ref2 = ()->{System.out.println("Hlo from annonoymus class");}

        F1 ref3 = ()->System.out.println("Hlo from ref3 lamda expressin");
        ref3.greeting();


        // interface 2

        F2 ref4 = new F2(){
            @Override
            public int add(int a,int b){
                return a+b;
            }
        };
        System.out.println("Addition usin anonumus class : "+ref4.add(10,20));

        F2 ref5 = (a,b)->  a+b;
        System.out.println("Unig lambda exp: "+ref5.add(20, 50));
    }
}