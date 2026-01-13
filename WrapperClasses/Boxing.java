public  class Boxing{

    public static void main(String[] args) {
        
        int a =10;
        Integer i= a;
        System.out.println("Inplicit boxing: "+i);
        Integer j = Integer.valueOf(a);
        System.out.println("Explicit conversion: "+j);


        ///
        ///
        Integer aa =11;
        int  ii = aa;
        System.out.println("Implicit unboxing: "+ii);

        int jj = aa.intValue();
        System.out.println("Explicit unboxing: "+jj);
        System.out.println();
        short s = 1;
        Short S = s;
        System.out.println("Implicit boxing of Short: "+S);

        Short SS= Short.valueOf(s);
        System.out.println("Explicit boxing of Short: "+SS);
        System.out.println();

        char c = 'A';
        Character C = c;
        System.out.println("Implicit boxing of Character: "+C);
        Character CC = Character.valueOf(c);
        System.out.println("Explicit boxing of Character: "+CC);







    }
}