package TwoDArraysPractice;

public class TwoDArraysPractice3 {
    public static void main(String[] args) {
        int[][] a = {
                {3, 7, 2},
                {8, 1, 5},
                {4, 6, 9}
        };

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
