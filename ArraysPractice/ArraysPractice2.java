package ArraysPractice;

public class ArraysPractice2 {
    public static void main(String[] args) {
        int[] a = {12, 5, 28, 3, 19, 7, 15, 9};

        int max = a[0];
        int maxIndex = 0;
        int min = a[0];
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }

        System.out.print("Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("Largest: " + max + " at index " + maxIndex);
        System.out.println("Smallest: " + min + " at index " + minIndex);
    }
}