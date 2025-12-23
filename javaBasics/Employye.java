// import java.util.Scanner;

// public class Employye{
//     public static void main(String[] args) {
//         int id,age,dep;
//         String name="",role="",access="";
//         double basicSal=0, finalSal=0;
//        Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Emp ID : ");
//         id = sc.nextInt();

//         System.out.print("Enter Emp name : ");
//         name = sc.next();

//         System.out.print("Enter Emp age : ");
//         age = sc.nextInt();

//         if(age<21){
//             System.out.println("Employee is not Eligible to work ");
//         }
//         else{
//             System.out.print("Enter Dep no. :");
//             dep = sc.nextInt();

//             switch (dep) {
//                 case 1:
//                     //hr
//                     System.out.print("The department is IT, Enter the Role : ");
//                     role = sc.next();
//                     System.out.print("Enter basic salary : ");
//                     basicSal = sc.nextDouble();

//                     switch (role) {
//                         case "Developer":
//                             finalSal = basicSal + (basicSal * 0.30);

//                             break;
//                         case "Tester":
//                             finalSal = basicSal + (basicSal * 0.25);
//                             break;
//                         default:
//                             System.out.println("Wrong Role");
//                     }
//                     if(finalSal >= 60000){
//                         access = "Admin Access";
//                     }else{
//                         access = "Employee access";
//                     }

                    
//                     break;
//                 case 2:
//                     System.out.print("The department is HR, Enter the Role : ");
//                     role = sc.next();
//                     System.out.print("Enter basic salary : ");
//                     basicSal = sc.nextDouble();

//                     switch (role) {
//                         case "Recruiter":
//                             finalSal = basicSal + (basicSal * 0.20);

//                             break;
//                         case "Payroll":
//                             finalSal = basicSal + (basicSal * 0.22);

//                             break;
//                         default:
//                             System.out.println("Wrong Role");
//                     }
//                     if(finalSal >= 60000){
//                         access = "Manager Access";
//                     }else{
//                         access = "Employee access";
//                     }

//                     break;
//                 case 3:
//                     System.out.print("The department is Finance, Enter the Role : ");
//                     role = sc.next();
//                     System.out.print("Enter basic salary : ");
//                     basicSal = sc.nextDouble();

//                     switch(role) {
//                         case "Accountant":
//                             finalSal = basicSal + (basicSal * 0.28);

//                             break;
//                         case "Auditor":
//                             finalSal = basicSal + (basicSal * 0.26);

//                             break;
//                         default:
//                             System.out.println("Wrong Role");
//                     }
//                     if(finalSal >= 60000){
//                         access = "Manager Access";
//                     }else{
//                         access = "Employee access";
//                     }
                 
//                     break;
//                 default:
//                     System.out.println("Wrong dep  numbber");

//             }

//              System.out.println("\n\nEmployeeId : "+id+"\nEmployee name : "+name+"\nDepartment : "+dep+"\nRole : "+role+"\nBasic Salary  : "+basicSal+ "\nFinal Salary : "+finalSal+ "\nAccess level : "+access);
//         }



//     }
// }

import java.util.Scanner;

public class Employye{
    public static void main(String[] args) {
        int id,age,travel;
        String name="",role="",booking="";
        double fare=0.0,finalFare=0.0,EndFare=0.0;
        double discount = 0;
        boolean isGov = false;
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger ID : ");
        id = sc.nextInt();

        System.out.print("Enter Passenger name : ");
        name = sc.next();

        System.out.print("Enter Passenger age : ");
        age = sc.nextInt();

        System.out.print("Is Government Employee(true/false): ");
        isGov = sc.nextBoolean();
        if(age<5){
            System.out.println("Free tickets for chote bachhas ");
        }
        else if(age>80){
            System.out.println("Bujurgo ke liye Free ticket");
        }
        else{
            System.out.print("Enter Travel Type: 1-Bus, 2-Train, 3-Flight :");
            travel = sc.nextInt();

            switch (travel) {
                case 1:
                    //hr
                    System.out.print("The Travel type is Bus, Enter the class (sleeper/seater) : ");
                    role = sc.next();
                    System.out.print("Enter Fare : ");
                    fare = sc.nextDouble();

                    switch (role) {
                        case "Sleeper":
                            fare = (fare * 1.2);

                            break;
                        case "seater":
                            fare = (fare * 1);
                            break;
                        default:
                            System.out.println("Wrong Class");
                    }
                    // if(finalSal >= 60000){
                    //     access = "Admin Access";
                    // }else{
                    //     access = "Employee access";
                    // }

                    
                    break;
                case 2:
                    System.out.print("The Travel type is Train, Enter the class (sleeper/General/AC) ");
                    role = sc.next();
                    System.out.print("Enter Fare: ");
                    fare = sc.nextDouble();

                    switch (role) {
                        case "Sleeper":
                            fare =   (fare * 1.3);

                            break;
                        case "General":
                            fare =  (fare * 1);

                            break;
                        case "AC":
                            fare =  (fare * 1.6);


                            break;
                        default:
                            System.out.println("Wrong Class");
                    }
                    // if(finalSal >= 60000){
                    //     access = "Manager Access";
                    // }else{
                    //     access = "Employee access";
                    // }

                    break;
                case 3:
                    System.out.print("The Travel is flight, Enter the class(Economy/Buisness) : ");
                    role = sc.next();
                    System.out.print("Enter Fare : ");
                    fare = sc.nextDouble();

                    switch(role) {
                        case "Economy":
                            fare = (fare * 2.5);

                            break;
                        case "Buisness":
                            fare =  (fare * 3.5);

                            break;
                        default:
                            System.out.println("Wrong Class");
                    }
                    // if(finalSal >= 60000){
                    //     access = "Manager Access";
                    // }else{
                    //     access = "Employee access";
                    // }
                 
                    break;
                default:
                    System.out.println("Wrong dep  numbber");

            }
            if(age>=60){
                discount = fare*0.30;
            }
            else if(isGov){
                discount = fare*0.15;
            }
            else if(5<age && age<12){
                discount = fare*0.50;
            }
            else{
                discount = 0;
            }
            finalFare = fare - discount;

            if(finalFare>=10000){
                if(travel == 3){
                    booking = "Confirmed";
                }else{
                    booking = "Waitlist";
                }
            }
            else{
                booking = "Confirmed";
            }

             System.out.println("\nPassenger Age : "+age+"\n Passenger name : "+name+"\nTravel type : "+travel+"\n class : "+role+"\nBase fare  : "+fare+ "\nDiscount  : "+discount+ "\nBooking status : "+booking+ "\n Total fare : "+finalFare );
        }



    }
}