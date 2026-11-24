package ArraysPractice;

public class ArraysPractice4 {
    public static void main(String[] args) {
        int[] a = {3, 8, 12, 5, 9, 2, 7};

        System.out.print("Original:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();

        System.out.print("Reversed:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}