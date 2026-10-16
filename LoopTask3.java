import java.util.Scanner;

public class LoopTask3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int val1 = num.nextInt();
        int val2 = 1;
        System.out.println(val2);
        while (val2 < val1) {
            val2 += 1;
            System.out.println(val2);
        }
        System.out.println();
        System.out.println();
        int val4 = 1;
        System.out.println(val4);
        do {
            val4 += 1;
            System.out.println(val4);
        } while (val4 < val1);
        System.out.println();
        System.out.println();
        for (int val3 = 1; val3 <= val1; val3 += 1)
            System.out.println(val3);
    }
}