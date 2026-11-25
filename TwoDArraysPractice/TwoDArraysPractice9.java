package TwoDArraysPractice;

import java.util.Scanner;

public class TwoDArraysPractice9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] a = {
                {4, 9, 15},
                {22, 7, 30},
                {11, 18, 2}
        };

        System.out.print("Enter a value to find: ");
        int target = input.nextInt();

        boolean found = false;
        for (int i = 0; i < a.length && !found; i++) {
            for (int j = 0; j < a[i].length && !found; j++) {
                if (a[i][j] == target) {
                    System.out.println("Found at row " + i + ", column " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
