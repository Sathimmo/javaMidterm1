package lab;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        double balance = 10.0;
        String[] items = {"Coke", "Pepi", "Milk", "Water"};
        double[] prices = {1.25, 1.50, 0.75, 0.25};
        boolean[] availability = {true, true, true, true};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Items available:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - $" + prices[i]);
        }

        while (true) {
            System.out.print("Enter the number of the item you wish to purchase (0 to exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for using the Vending Machine. Your remaining balance is: $" + balance);
                break;
            }

            if (choice > 0 && choice <= items.length) {
                int index = choice - 1;

                if (availability[index]) {
                    if (balance >= prices[index]) {
                        System.out.println("Dispensing " + items[index] + ". Enjoy!");
                        balance -= prices[index];
                    } else {
                        System.out.println("Insufficient funds. Please add more money.");
                    }
                } else {
                    System.out.println(items[index] + " is out of stock.");
                }
            } else {
                System.out.println("Invalid choice. Please select a valid item number.");
            }
        }

        scanner.close();
    }
}
