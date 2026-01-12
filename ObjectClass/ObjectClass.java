

    public class  ObjectClass{
        int id;
        String name;
        public ObjectClass(int id,String name){
            this.id = id;
            this.name = name;
        }
        @Override
        public void toString(){
            System.out.println("id :"+this.id+" Name: "+this.name);
        }

        public static void main(String[] args) {
            ObjectClass o1 = new ObjectClass(10,"Babal");

            System.out.println(o1.toString());

        }
    }