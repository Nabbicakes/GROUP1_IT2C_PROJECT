import java.util.Scanner;

public class Sales {

    static void recordSale(Scanner sc) {

        System.out.println("\n========================================");
        System.out.println("            SALES RECORDING");
        System.out.println("========================================");

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter price: ₱");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = price * quantity;

        System.out.println("\n----------------------------------------");
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Price: ₱" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: ₱" + total);
        System.out.println("----------------------------------------");

        System.out.print("Enter payment: ₱");
        double payment = sc.nextDouble();

        if (payment >= total) {

            double change = payment - total;
            System.out.println("\n========================================");
            System.out.println("Payment successful!");
            System.out.println("Change: ₱" + change);
            System.out.println("========================================");

        } else {

            double credit = total - payment;

            CreditLedger.customerName = customerName;
            CreditLedger.creditBalance = credit;

            System.out.println("\n========================================");
            System.out.println("Payment is insufficient.");
            System.out.println("Remaining Credit: ₱" + credit);
            System.out.println("Credit recorded successfully.");
            System.out.println("========================================");
        }

        sc.nextLine();

        System.out.println("Sales recording complete.");
        System.out.println("========================================");

        System.out.print("Press ENTER to go back to the main menu...");
        sc.nextLine();
    }
}