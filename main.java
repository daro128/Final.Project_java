import java.util.Scanner;

public class main {
    
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
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("=============Welcome To Stock Management System==============");
                    System.out.print("Enter The Password To continue: ");
                    int admin_password = sc.nextInt();
                    if(admin_password == 12345){ 
                        System.out.println("Login success...!"); 
                        // Function Admin
                    } else {
                        System.out.println("Wrong password! Login Fail....!");
                    }
                    break;
                    
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.print("Enter User name and Id To continue: ");
                    int staff_id = sc.nextInt();
                    if(staff_id == 123){
                        System.out.println("done..!"); 
                        // Function staff
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