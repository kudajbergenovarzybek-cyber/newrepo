package ArraysHW;

public class ArraysHW4 {

    static void findDuplicates(int[] a) {
        System.out.print("Array: ");
        for (int x : a) System.out.print(x + " ");
        System.out.println();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length; i++) {

            boolean seenBefore = false;
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    seenBefore = true;
                    break;
                }
            }
            if (seenBefore) continue;


            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    result.append(a[i]).append(" ");
                    break;
                }
            }
        }

        if (result.length() == 0) {
            System.out.println("No duplicate numbers.");
        } else {
            System.out.println("Duplicate numbers: " + result);
        }
    }

    public static void main(String[] args) {
        findDuplicates(new int[]{4, 7, 2, 4, 9, 7, 1, 2, 8, 4});
        System.out.println();
        findDuplicates(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }
}