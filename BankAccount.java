import java.util.Scanner;
 // jr static non static variable inside static use karat asal tr error yeto 
class BankAccount {
    static int accountNumber = 12345;
    static String accountHolder = "Kartikesh";
    static double balance = 0; 
    static int pin = 3355;  // added pin
    static Scanner sc = new Scanner(System.in);

    public static void checkBalance() {
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == pin) {
            System.out.println("Your current balance is: " + balance);
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    public static void deposit() {
        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public static void withdraw() {
        System.out.print("Enter withdraw amount: ");
        double withdraw = sc.nextDouble();
        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void transfer() {
        System.out.println("Transfer function not implemented yet.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===  Bank Of India ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using XYZ Bank!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
