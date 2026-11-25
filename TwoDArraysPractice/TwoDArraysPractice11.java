package TwoDArraysPractice;
public class TwoDArraysPractice11 {
    public static void main(String[] args) {
        int[][] a = {
                {5, -2, 7},
                {-8, 4, -1},
                {3, 6, -9}
        };

        System.out.println("Before:");
        printMatrix(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    a[i][j] = 0;
                }
            }
        }

        System.out.println("After:");
        printMatrix(a);
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
