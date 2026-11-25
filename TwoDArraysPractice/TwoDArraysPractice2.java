package TwoDArraysPractice;

public class TwoDArraysPractice2 {
    public static void main(String[] args) {
        int[][] a = {
                {5, 10, 15},
                {20, 25, 30}
        };

        System.out.println("a[1][2] = " + a[1][2]);

        a[0][1] = 99;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
