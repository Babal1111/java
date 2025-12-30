// class NonStatic{

//     { // nonstatic block
//         System.out.println("--------------- New Object of NonStatic class ------------");
//     }
//     public static void main(String[] args) {
//         System.out.println("main start");
//         NonStatic ref1 = new NonStatic();
//         NonStatic ref2 = new NonStatic();
//         NonStatic ref3 = new NonStatic();
//         System.out.println("Main end");
        
//     }

// }

    // wjap to exicute instance intialiser block and non-static method before the execution of main method




class NonStatic{

    { // nonstatic block
        System.out.println("--------------- New Object of NonStatic class ------------");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println("Main end");
        
    }
    public void test(){
        System.out.println("Test method executed");
    }

    static {
        System.out.println("Static block execited");
        NonStatic ref1 = new NonStatic();
        NonStatic ref2 = new NonStatic();
        NonStatic ref3 = new NonStatic();
        ref1.test();

    }

}
