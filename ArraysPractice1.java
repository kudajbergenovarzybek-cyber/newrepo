public class ArraysPractice1 {
    public static void main(String[] args) {
        int[] a = {5, -3, 0, 8, -1, 0, 12, -7, 4, 2};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positive++;
            } else if (a[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.print("Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}