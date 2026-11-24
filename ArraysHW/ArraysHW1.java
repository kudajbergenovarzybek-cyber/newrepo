package ArraysHW;

public class ArraysHW1 {
    public static void main(String[] args) {
        int[] numbers = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};

        System.out.print("Original: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        int replacements = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
                replacements++;
            }
        }

        System.out.print("Modified: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
        System.out.println("Replacements: " + replacements);
    }
}