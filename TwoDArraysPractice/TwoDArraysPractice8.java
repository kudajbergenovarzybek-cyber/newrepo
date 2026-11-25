package TwoDArraysPractice;

import java.util.Scanner;

public class TwoDArraysPractice8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] a = {
                {4, 9, 15},
                {22, 7, 30},
                {11, 18, 2}
        };

        System.out.print("Enter a number: ");
        int threshold = input.nextInt();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > threshold) {
                    count++;
                }
            }
        }

        System.out.println("Values greater than " + threshold + ": " + count);
    }
}

