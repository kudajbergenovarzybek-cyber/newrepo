import java.util.InputMismatchException;
import java.util.Scanner;


private static final int CORRECT_PIN = 1234;
private static final int MAX_ATTEMPTS = 3;

static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    double balance = 1000.0;

    System.out.println("===== SIMPLE ATM =====");


    boolean loggedIn = false;
    int attemptsLeft = MAX_ATTEMPTS;

    while (attemptsLeft > 0) {
        System.out.print("Enter your PIN: ");
        int pin;
        try {
            pin = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next();
            pin = -1;
        }

        if (pin == CORRECT_PIN) {
            System.out.println("Login successful!");
            loggedIn = true;
            break;
        }

        attemptsLeft--;
        System.out.println("Incorrect PIN.");
        if (attemptsLeft > 0) {
            System.out.println("Remaining attempts: " + attemptsLeft);
        }
    }

    if (!loggedIn) {
        System.out.println("Your account has been blocked.");
        scanner.close();
        return;
    }

    int choice = 0;
    while (choice != 4) {
        System.out.println();
        System.out.println("===== ATM MENU =====");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next();
            System.out.println("Invalid option. Please enter a number from 1 to 4.");
            choice = 0;
            continue;
        }

        switch (choice) {
            case 1:
                System.out.printf("Your current balance: %.2f%n", balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double deposit = readAmount(scanner);
                if (deposit > 0) {
                    balance += deposit;
                    System.out.printf("Deposit successful. New balance: %.2f%n", balance);
                } else {
                    System.out.println("Invalid amount. Amount must be greater than zero.");
                }
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdrawal = readAmount(scanner);
                if (withdrawal <= 0) {
                    System.out.println("Invalid amount. Amount must be greater than zero.");
                } else if (withdrawal > balance) {
                    System.out.println("Insufficient funds.");
                } else {
                    balance -= withdrawal;
                    System.out.printf("Withdrawal successful. New balance: %.2f%n", balance);
                }
                break;

            case 4:
                System.out.println("Thank you for using Simple ATM. Goodbye!");
                break;


            default:
                System.out.println("Invalid option. Please enter a number from 1 to 4.");
        }
    }

    scanner.close();
}

private static double readAmount(Scanner scanner) {
    try {
        return scanner.nextDouble();
    } catch (InputMismatchException e) {
        scanner.next();
        return -1;
    }



}