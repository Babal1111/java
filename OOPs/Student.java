class Student{

    int id;
    String name;
    int []marks= new int [3];

    public Student(int id, String name, int []marks){
        this.id = id;
        this.name = name;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = marks[i];
        }

    }
    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s.marks[i];
        }
    }
    public static void main(String[] args) {
        
        System.out.println("main method");
        // int marks[] = new int[3];
        // marks = {90,88,100};

        
        int marks[] = {90,80,88}; 
        Student s1 = new Student(11,"Babal",marks); //it will print address of array

        System.out.println("Id : "+s1.id+" Name : "+s1.name+" ,Marks : "+s1.marks[0]+" "+s1.marks[1]+" "+s1.marks[2]);

        Student s2 = new Student(s1);
        System.out.println("    ----------- COPY CONSTRUCTOR ---------\nId : "+s2.id+" Name : "+s2.name+" ,Marks : "+s2.marks[0]+" "+s2.marks[1]+" "+s2.marks[2]);



    }
}