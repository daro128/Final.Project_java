import java.util.Scanner;
public class Staff {
    private int id;
    private String username;
    public Staff(int id, String username){
        this.id=id;
        this.username=username;
    }
    public boolean Login(int id_input, String username_input){
        return this.id==id_input&&this.username.equals(username_input);
    }
    public void Run(Scanner sc){
        int choice=0;
        do{
            System.out.println("===================== Staff Menu =====================");
            System.out.println("1. View Products");
            System.out.println("2. Sell Product");
            System.out.println("0. Back");
            System.out.print("Enter option: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                case 1:
                    System.out.println("View Product......!");
                    break;
                case 2:
                    System.out.println("Sell Product......!");
                    break;
                default:
                    System.out.println("Invalide Choice Please choose from (0-2)");
            }
            System.out.println();

        }while(choice!=0);


    }
}
