package ArraysHW;

public class ArraysHW2 {

    static void secondLargest(int[] a) {
        System.out.print("Array: ");
        for (int x : a) System.out.print(x + " ");
        System.out.println();

        int max = a[0];
        for (int x : a) {
            if (x > max) max = x;
        }

        int second = 0;
        boolean hasSecond = false;
        for (int x : a) {
            if (x < max && (!hasSecond || x > second)) {
                second = x;
                hasSecond = true;
            }
        }

        if (hasSecond) {
            System.out.println("Largest: " + max + " Second largest: " + second);
        } else {
            System.out.println("No second largest distinct number.");
        }
    }

    public static void main(String[] args) {
        secondLargest(new int[]{10, 25, 8, 30, 15, 30});
        System.out.println();
        secondLargest(new int[]{5, 5, 5, 5, 5, 5});
    }
}