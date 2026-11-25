package TwoDArraysPractice;

public class TwoDArraysPractice10 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        System.out.println("Main diagonal:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i] + " ");
            sum += a[i][i];
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
