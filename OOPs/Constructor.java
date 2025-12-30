class Constructor{

    int id;
    String name;

    public Constructor(int id,String name) {
        this.id = id;
        this.name = name;

    }

    

    public static void main(String[] args) {
        Constructor student1 = new Constructor(11,"babal");
        System.out.println("id & name : "+student1.id+" : "+student1.name);
    }
}