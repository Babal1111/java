// prog to write static  method , to rreturn address of an object

class Question{


    static Question address(){
       Question q1 = new  Question();

       return q1;

    }
    public static void main(String[] args) {

           System.out.println(address());
    }
}