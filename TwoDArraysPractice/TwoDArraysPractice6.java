package TwoDArraysPractice;

import java.util.Scanner;

public class TwoDArraysPractice6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[2][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter a[" + i + "][" + j + "]: ");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Your matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
