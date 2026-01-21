import java.util.Scanner;
import data1.insertData;
import data1.makeItem;

public class Admin {
    private final int password = 12345;
    public boolean login(int inputPassword) {
        return inputPassword == password;
    }    
    public void run(Scanner sc) { 
        int choice;
        do {
            System.out.println("=== Admin Menu ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("0. Back");
            System.out.print("Enter option: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Adding Product...");
                    insertData data = new insertData();
                    for (makeItem it : data.item) {
                        System.out.println(it.id + " " + it.name + " " + it.quantity + " " + it.buy + " " + it.sell + " " + it.profit + " " + it.totalProfit);
                    }
                    System.out.println("\n--- Using printData ---");
                    data1.printData.main(new String[0]); 
                    break;
                case 2:
                    System.out.println("\n--- Using printData ---");
                    data1.printData.main(new String[0]); 
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option! Please choose 0-2.");
            }
            System.out.println();

        } while(choice != 0);
    }
}
