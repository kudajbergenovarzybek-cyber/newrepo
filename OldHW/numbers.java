
void main(String[] args){




    Scanner scanner = new Scanner(System.in);

    int positive = 0;
    int negative = 0;
    int zeros = 0;
    int even = 0;
    int odd = 0;

    for (int i = 1; i <= 10; i++) {
        System.out.print("Enter number " + i + ": ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter an integer for number " + i + ": ");
            scanner.next();
        }
        int n = scanner.nextInt();

        if (n > 0) {
            positive++;
        } else if (n < 0) {
            negative++;
        } else {
            zeros++;
        }

        // n % 2 can be -1 for negative odd OldHW.numbers, so compare with 0
        if (n % 2 == 0) {
            even++;   // zero counts as even
        } else {
            odd++;
        }
    }

    System.out.println();
    System.out.println("===== STATISTICS =====");
    System.out.println("Positive OldHW.numbers: " + positive);
    System.out.println("Negative OldHW.numbers: " + negative);
    System.out.println("Zeros: " + zeros);
    System.out.println("Even OldHW.numbers: " + even);
    System.out.println("Odd OldHW.numbers: " + odd);

    scanner.close();


}