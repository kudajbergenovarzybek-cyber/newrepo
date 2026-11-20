public class ArraysPractice3 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        double average = (double) sum / a.length;

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > average) {
                count++;
            }
        }

        System.out.print("Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + count);
    }
}