class TypeCasting{
    public static void main(String[] args) {
        double d = 45.78;
        int a = (int) d;
        System.out.println(a);

        int x = 130;
        byte b = (byte) x;
        System.out.println(b);

        //long->int->short->byte
        System.out.println("\n                                     long->int->short->byte   ");
        long l = 999999999;
        System.out.println(" Long = "+l);

        int i = (int) l;
        System.out.println(" Integer = "+i);

        short s = (short) i;
        System.out.println(" Short = "+s);

        byte t = (byte) s;
        System.out.println(" Byte = "+t);


    }
}