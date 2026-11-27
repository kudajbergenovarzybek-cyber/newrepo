package TwoDArraysPractice2;

import java.util.Arrays;
import java.util.Scanner;

public class AllTasks {

    // 1. Print numbers at even indices (0, 2, 4, 6)
    static void task1() {
        System.out.println("Task 1: even indices ");
        int[][] tests = {
                {4, 7, 9, 2, 5, 8, 1, 6},
                {10, 20, 30, 40, 50, 60, 70, 80}
        };
        for (int[] a : tests) {
            System.out.println("Array: " + Arrays.toString(a));
            System.out.print("Even indices: ");
            for (int i = 0; i < a.length; i += 2) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    // 2. Sum of positive numbers (array of 10)
    static void task2() {
        System.out.println(" Task 2: sum of positive numbers ");
        int[][] tests = {
                {3, -2, 0, 7, -4, 5, 1, -8, 2, 6},
                {-1, -2, -3, 4, 4, 0, 0, 9, -5, 1}
        };
        for (int[] a : tests) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 0) {
                    sum += a[i];
                }
            }
            System.out.println("Array: " + Arrays.toString(a));
            System.out.println("Sum: " + sum);
        }
    }

    // 3. Count values from 10 to 20 inclusive (input from the user)
    static void task3() {
        System.out.println(" Task 3: count values from 10 to 20 ");
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];
        System.out.println("Enter 8 integers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 10 && a[i] <= 20) {
                count++;
            }
        }
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Count: " + count);
    }

    // 4. Minimum and the index of its first occurrence (array of 7)
    static void task4() {
        System.out.println(" Task 4: minimum and its index ");
        int[][] tests = {
                {8, 3, 5, 3, 9, 2, 6},
                {5, 1, 7, 1, 4, 9, 3}
        };
        for (int[] a : tests) {
            int min = a[0];
            int minIndex = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] < min) {      // strict "<" keeps the first occurrence
                    min = a[i];
                    minIndex = i;
                }
            }
            System.out.println("Array: " + Arrays.toString(a));
            System.out.println("Min: " + min + ", index: " + minIndex);
        }
    }

    // 5. Add 5 to every element (array of 6)
    static void task5() {
        System.out.println(" Task 5: add 5 to every element ");
        int[][] tests = {
                {1, 4, -2, 0, 8, 3},
                {10, -5, 0, 7, -10, 2}
        };
        for (int[] a : tests) {
            System.out.println("Before: " + Arrays.toString(a));
            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] + 5;
            }
            System.out.print("After: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    // 6. Count later elements greater than the first (array of 8)
    static void task6() {
        System.out.println(" Task 6: compare with the first element ");
        int[][] tests = {
                {6, 9, 3, 8, 6, 10, 2, 7},
                {1, 5, 0, 1, 2, -3, 8, 1}
        };
        for (int[] a : tests) {
            int count = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] > a[0]) {
                    count++;
                }
            }
            System.out.println("Array: " + Arrays.toString(a));
            System.out.println("First element: " + a[0] + ", Count: " + count);
        }
    }

    // 7. Copy only even numbers into a second array (array of 8)
    static void task7() {
        System.out.println(" Task 7: copy only even numbers ");
        int[][] tests = {
                {3, 8, 5, 2, 7, 4, 9, 6},
                {1, 3, 5, 7, 10, 12, 0, 15}
        };
        for (int[] a : tests) {
            int[] evens = new int[a.length];
            int n = 0;                       // how many even numbers were copied
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    evens[n] = a[i];
                    n++;
                }
            }
            System.out.println("Array: " + Arrays.toString(a));
            System.out.print("Even numbers: ");
            for (int i = 0; i < n; i++) {    // print only copied entries
                System.out.print(evens[i] + " ");
            }
            System.out.println();
        }
    }

    // 8. Weekly temperatures: average and number of days above average (7 days)
    static void task8() {
        System.out.println(" Task 8: weekly temperatures ");
        int[][] tests = {
                {18, 20, 22, 19, 21, 24, 16},
                {5, 7, 6, 9, 3, 4, 8}
        };
        for (int[] t : tests) {
            int sum = 0;
            for (int i = 0; i < t.length; i++) {
                sum += t[i];
            }
            double average = (double) sum / t.length;
            int above = 0;
            for (int i = 0; i < t.length; i++) {
                if (t[i] > average) {
                    above++;
                }
            }
            System.out.println("Temperatures: " + Arrays.toString(t));
            System.out.println("Average: " + average + "; above: " + above);
        }
    }

    // 9. Print a 2x3 matrix in two rows
    static void task9() {
        System.out.println(" Task 9: 2x3 timetable ");
        int[][][] tests = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}}
        };
        for (int[][] m : tests) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // 10. Count zeros in a 3x3 matrix
    static void task10() {
        System.out.println(" Task 10: count zeros ");
        int[][][] tests = {
                {{0, 2, 3}, {4, 0, 6}, {0, 8, 0}},
                {{1, 0, 0}, {0, 5, 6}, {7, 8, 9}}
        };
        for (int[][] m : tests) {
            int zeros = 0;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + " ");
                    if (m[i][j] == 0) {
                        zeros++;
                    }
                }
                System.out.println();
            }
            System.out.println("Zeros: " + zeros);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
    }
}