import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00; // Initial balance
        boolean exit = false;

        while (!exit) {
            System.out.println("\nATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2:
                    // Deposit money
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("You have successfully deposited $" + depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    // Withdraw money
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("You have successfully withdrawn $" + withdrawAmount);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;
                case 4:
                    // Exit
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid option. Please choose a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}
