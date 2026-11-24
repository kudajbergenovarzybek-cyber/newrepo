package ArraysPractice;

import java.util.Scanner;

public class ArraysPractice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];


        for (int i = 0; i < scores.length; i++) {
            int score;
            do {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                score = sc.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score! Try again.");
                }
            } while (score < 0 || score > 100);
            scores[i] = score;
        }

        int passed = 0;
        int failed = 0;
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                passed++;
            } else {
                failed++;
            }
            sum = sum + scores[i];
        }
        double average = (double) sum / scores.length;

        System.out.print("Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(" " + scores[i]);
        }
        System.out.println();
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);
    }
}