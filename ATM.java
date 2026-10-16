import java.util.Scanner;



static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int attemptsLeft = 3;
    int PIN = 1234;
    boolean accessGranted = false;
    while (attemptsLeft > 0 && !accessGranted) {
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (pin == PIN) {
            accessGranted = true;
            System.out.println("Access granted!");
        } else {
            attemptsLeft--;
            System.out.println("Incorrect PIN. Attempts left: " + attemptsLeft);
        }
    }

    if (!accessGranted) {
        System.out.println("Card blocked.");
    }


}