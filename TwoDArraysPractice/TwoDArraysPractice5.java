package TwoDArraysPractice;

public class TwoDArraysPractice5 {
    public static void main(String[] args) {
        int[][] a = {
                {12, 5, 8, 21},
                {3, 17, 9, 14},
                {25, 6, 11, 2}
        };


        int min = a[0][0];
        int max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
