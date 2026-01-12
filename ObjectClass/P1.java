public  class  P1{
        int id;
        String name;
        public P1(int id,String name){
            this.id = id;
            this.name = name;
        }


    public static void main(String[] args) {
        P1 ref = new P1(1,"Babal");
        System.out.println(ref.hashCode());
        System.out.println(Integer.toHexString(ref.hashCode())); 
        System.out.println(ref);

        System.out.println(ref.getClass());
        System.out.println(ref.getClass().getName());
        System.out.println(ref.getClass().getName()+"@"+Integer.toHexString(ref.hashCode()));



        //// 
        P1 ref1 = new P1(2,"babal");
        P1 ref2 = new P1(2,"babal");

        System.out.println(ref1 == ref2);
        System.out.println(ref1.equals(2)); //both compares address

    }
}