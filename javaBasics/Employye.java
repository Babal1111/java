import java.util.Scanner;

public class Employye{
    public static void main(String[] args) {
        int id,age,dep;
        String name="",role="",access="";
        double basicSal=0, finalSal=0;
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter Emp ID : ");
        id = sc.nextInt();

        System.out.print("Enter Emp name : ");
        name = sc.next();

        System.out.print("Enter Emp age : ");
        age = sc.nextInt();

        if(age<21){
            System.out.println("Employee is not Eligible to work ");
        }
        else{
            System.out.print("Enter Dep no. :");
            dep = sc.nextInt();

            switch (dep) {
                case 1:
                    //hr
                    System.out.print("The department is IT, Enter the Role : ");
                    role = sc.next();
                    System.out.print("Enter basic salary : ");
                    basicSal = sc.nextDouble();

                    switch (role) {
                        case "Developer":
                            finalSal = basicSal + (basicSal * 0.30);

                            break;
                        case "Tester":
                            finalSal = basicSal + (basicSal * 0.25);
                            break;
                        default:
                            System.out.println("Wrong Role");
                    }
                    if(finalSal >= 60000){
                        access = "Admin Access";
                    }else{
                        access = "Employee access";
                    }

                    
                    break;
                case 2:
                    System.out.print("The department is HR, Enter the Role : ");
                    role = sc.next();
                    System.out.print("Enter basic salary : ");
                    basicSal = sc.nextDouble();

                    switch (role) {
                        case "Recruiter":
                            finalSal = basicSal + (basicSal * 0.20);

                            break;
                        case "Payroll":
                            finalSal = basicSal + (basicSal * 0.22);

                            break;
                        default:
                            System.out.println("Wrong Role");
                    }
                    if(finalSal >= 60000){
                        access = "Manager Access";
                    }else{
                        access = "Employee access";
                    }

                    break;
                case 3:
                    System.out.print("The department is Finance, Enter the Role : ");
                    role = sc.next();
                    System.out.print("Enter basic salary : ");
                    basicSal = sc.nextDouble();

                    switch(role) {
                        case "Accountant":
                            finalSal = basicSal + (basicSal * 0.28);

                            break;
                        case "Auditor":
                            finalSal = basicSal + (basicSal * 0.26);

                            break;
                        default:
                            System.out.println("Wrong Role");
                    }
                    if(finalSal >= 60000){
                        access = "Manager Access";
                    }else{
                        access = "Employee access";
                    }
                 
                    break;
                default:
                    System.out.println("Wrong dep  numbber");

            }

             System.out.println("\n\nEmployeeId : "+id+"\nEmployee name : "+name+"\nDepartment : "+dep+"\nRole : "+role+"\nBasic Salary  : "+basicSal+ "\nFinal Salary : "+finalSal+ "\nAccess level : "+access);
        }



    }
}