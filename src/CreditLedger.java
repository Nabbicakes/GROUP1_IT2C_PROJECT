import java.util.Scanner;

public class CreditLedger {

    static String customerName = "";
    static double creditBalance = 0;

    static void manageCredit(Scanner sc) {

        System.out.println("\n========================================");
        System.out.println("             CREDIT LEDGER");
        System.out.println("========================================");

        if (creditBalance <= 0) {

            System.out.println("No outstanding credit.");

        } else {

            System.out.println("Customer: " + customerName);
            System.out.println("Current Credit: ₱" + creditBalance);

            System.out.print("\nEnter payment: ₱");
            double payment = sc.nextDouble();

            if (payment >= creditBalance) {

                double change = payment - creditBalance;

                creditBalance = 0;

                System.out.println("\nPayment complete!");
                System.out.println("Remaining Credit: ₱0");
                System.out.println("Status: PAID");

                if (change > 0) {
                    System.out.println("Change: ₱" + change);
                }

            } else {

                creditBalance = creditBalance - payment;

                System.out.println("\nPayment recorded!");
                System.out.println("Remaining Credit: ₱" + creditBalance);
                System.out.println("Status: UNPAID");
            }

            sc.nextLine();
        }

        System.out.println("----------------------------------------");
    }
}