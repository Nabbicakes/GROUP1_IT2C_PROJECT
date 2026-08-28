import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("========================================");
        System.out.println("   MICRO-RETAIL SALES & CREDIT LEDGER");
        System.out.println("========================================");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\n========================================");
        System.out.println("Welcome, " + name + "!");
        System.out.println("========================================");

        while (true) {

            System.out.println("\n========================================");
            System.out.println("              MAIN MENU");
            System.out.println("========================================");
            System.out.println("1. Sales Recording");
            System.out.println("2. Credit Ledger");
            System.out.println("3. Exit");
            System.out.println("========================================");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    Sales.recordSale(sc);
                    break;

                case 2:
                    CreditLedger.manageCredit(sc);
                    break;

                case 3:
                    System.out.println("\n========================================");
                    System.out.println("Thank you for using the system!");
                    System.out.println("========================================");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}