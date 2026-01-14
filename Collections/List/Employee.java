import java.util.ArrayList;
import java.util.List;

class Employeee{
        int id;
        String name;
        double sal;
        public  Employeee(int id,String name,double  sal){
            this.id = id;
            this.name = name;
            this.sal = sal;
        }
    public static Employeee createEmp(int id,String name,double  sal){
        return new Employeee(id, name,sal);
    }
    public void display(){
        System.out.println(id+" : "+name+" : "+sal);
    }
}
class Company{
    List <Employeee> li = new ArrayList<Employeee>();
    public Company(Employeee emp){
        li.add(emp);
    }
    public void display(){
        System.out.println("No. of Emp: "+li.size());
        System.out.println(li);
    }
}

public  class Employee{

    public static void main(String[] args) {
        

    Employeee e1 = new Employeee(101,"Babal",101010);
        e1.display();
    Company c1 = new Company(e1);
    Employeee e2 = new Employeee(102,"preet",1010);
    
    c1.display();
    }
}