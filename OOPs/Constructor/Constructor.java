class Constructor{

    int id;
    String name;
    double percentage;

    public Constructor(int id) {
        this.id = id;

    }
    public Constructor(String name) {
        this.name = name;

    }
    public Constructor(double  percentage) {
        this.percentage = percentage;

    }
   public Constructor(int id,double  percentage) {
        this.id = id;
        this.percentage = percentage;
    }
    public Constructor(String name, double percentage) {
        this.percentage = percentage;
        this.name = name;
    }
    public Constructor(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public Constructor(int id, String name, double percentage) {
        this.id = id;
        this.percentage = percentage;
        this.name = name;
    }


    public Constructor() {
        this.percentage = 0;
        this.name = "name";
        this.id = 0;
    }

    public  static void printDetail(Constructor student){
        System.out.println("Id: "+student.id);
        System.out.println("Name: "+student.name);
        System.out.println("Percentage: "+student.percentage);

        System.out.println();

    }


    
    

    public static void main(String[] args) {
        Constructor student1 = new Constructor(11,"babal");
        // System.out.println("id & name : "+student1.id+" : "+student1.name+"\n");
        student1.printDetail(student1);

        Constructor student2 = new Constructor("babalpreet");
        // System.out.println("ONLY name : "+student2.name+"\n");
        student2.printDetail(student2);

         Constructor student3 = new Constructor(1101);
        // System.out.println("Only ID: "+student3.id+"\n");
        student3.printDetail(student3);




         Constructor student4 = new Constructor("babalpp",92.4);
        System.out.println("Percentage  & name : "+student4.percentage+" : "+student4.name+"\n");

         Constructor student5 = new Constructor(420,"preet",75.7);
        // System.out.println("id & name & percentage: "+student5.id+" : "+student5.name +" : "+student5.percentage+"\n");
        student3.printDetail(student3);

         Constructor student6 = new Constructor();
        System.out.println("id & name : "+student6.id+" : "+student6.name+"\n");



    }
}