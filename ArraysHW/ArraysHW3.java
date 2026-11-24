package ArraysHW;

import java.util.Scanner;

public class ArraysHW3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        try (Scanner sc = new Scanner(System.in)) {
            int index;
            while (true) {
                System.out.print("Enter index to remove: ");
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input! Enter a number.");
                    sc.next();
                    continue;
                }
                index = sc.nextInt();
                if (index >= 0 && index < numbers.length) break;
                System.out.println("Invalid index! Must be from 0 to " + (numbers.length - 1) + ".");
            }

            for (int i = index; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }


            System.out.print("Updated: ");
            for (int i = 0; i < numbers.length - 1; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }
}