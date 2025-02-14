import java.util.Scanner;

public class BankProgram {
    private static final String PASSWORD = "Akash";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Account Name:");
        String AccountName = scanner.nextLine();

        System.out.println("Enter the password to log in:");
        String inputPassword = scanner.nextLine();

        if (AccountName.equals("1234") && inputPassword.equals(PASSWORD)) {
            System.out.println("Login successful!");
            displayMenu(scanner);
        } else {
            System.out.println("Incorrect password. Access denied.");
        }

        scanner.close();
    }

    public static void displayMenu(Scanner scanner) {
        int choice;

        do {
            System.out.println("**************Menu**************");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Transfer Amount to another Account");
            System.out.println("5. Log out");
            System.out.println("********************************");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is $1000.");
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.println("You have withdrawn $" + withdrawAmount);
                    System.out.println("Your balance is now $" + (1000 - withdrawAmount));
                    break;
                case 3:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    System.out.println("You have deposited $" + depositAmount);
                    System.out.println("Your balance is now $" + (1000 + depositAmount));
                    break;
                case 4:
                    System.out.println("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    System.out.println("Enter account number to transfer to: ");
                    String accountNumber = scanner.next();
                    System.out.println("You have transferred $" + transferAmount + " to account " + accountNumber);
                    System.out.println("Your balance is now $" + (1000 - transferAmount));
                    break;
                case 5:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        System.out.println("Thank you for using our banking system!");
    }
}