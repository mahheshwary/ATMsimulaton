import java.util.Scanner;
class Account {
    private double balance;
    
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void changePin(int newPin) {
        // Implement PIN change logic here
        // For simplicity, let's assume the PIN is stored as an integer
        // We can use a separate class for security purposes
    }

    // Add transaction history functionality here
}

public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double initialBalance = 10000.0; // Initial account balance

        Account account = new Account(initialBalance);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Account Balance Inquiry");
            System.out.println("2. Cash Withdrawal");
            System.out.println("3. Cash Deposit");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Account balance:" + account.getBalance() + "/-");
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = in.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = in.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter new PIN: ");
                    int newPin = in.nextInt();
                    account.changePin(newPin);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
