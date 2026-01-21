import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 1;

        do{
            System.out.println("=============Welcome To Stock Management System==============");
            System.out.println("1.Admin");
            System.out.println("2.Staff");
            System.out.println("3.Help");
            System.out.println("0.Exit");
            System.out.println("==============================================================");
            System.out.print("Please Enter an option To continue (0-3): ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                    
                case 1:
                    System.out.println("=============Welcome To Stock Management System==============");
                    System.out.print("Enter The Password To continue: ");
                    int admin_password = sc.nextInt();
                    Admin admin= new Admin();
                    if(admin.login(admin_password)){ 
                        System.out.println("Login success...!");
                        admin.run(sc); 
                    } else {
                        System.out.println("Wrong password! Login Fail....!");
                    }
                    break;
                    
                case 2:
                    System.out.print(" Please Enter Id : ");
                    int staff_id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Please Enter The username:");
                    String Staff_username=sc.nextLine();
                    Staff staff = new Staff(123, "John");
                    if(staff.Login(staff_id, Staff_username)){
                        System.out.println("Login success...!");
                        staff.Run(sc);
                    }else{
                        System.out.println("Invalide password or username Please Enter again.");
                    }

                    break;
                    
                case 3:
                    System.out.println("Help.....!");
                    break;
            
                default:
                    System.out.println("\nInvalid Option! Please choose 0-3.");
                    System.out.print("Press Enter to continue...");
                    sc.nextLine();
                    sc.nextLine();
            }
            
        } while(choice != 0);
        
        sc.close();
    }
}