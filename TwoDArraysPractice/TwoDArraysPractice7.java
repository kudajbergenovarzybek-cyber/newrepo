package TwoDArraysPractice;
public class TwoDArraysPractice7 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int j = 0; j < a[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < a.length; i++) {
                colSum += a[i][j];
            }
            System.out.println("Column " + j + ": " + colSum);
        }
    }
}
