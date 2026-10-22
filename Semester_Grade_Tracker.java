import java.util.Scanner;

public class Semester_Grade_Tracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double assgPoint = 0;
        int assgCount = 0;
        int exam = 0;
        int exCount = 0;
        int score;

        double overallAverage;
        char ch;
        double assgAvg;
        double examAvg;

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== SEMESTER GRADE TRACKER =====");
            System.out.println("1. Add assignment result");
            System.out.println("2. Add exam result");
            System.out.println("3. View current grade");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter assignment score: ");
                    score = sc.nextInt();
                    assgPoint += score;
                    assgCount += 1;
                    System.out.println("Assigment score added!");
                    break;
                case 2:
                    System.out.println("Enter exam score: ");
                    score = sc.nextInt();
                    exam += score;
                    exCount++;
                    System.out.println("Exam score added!");
                    break;
                case 3:

                    if (assgCount > 0 || exCount > 0) {

                        assgAvg = assgCount > 0 ? (double) assgPoint / assgCount : 0;
                        examAvg = exCount > 0 ? (double) exam / exCount : 0;
                        if (assgCount > 0 && exCount > 0) overallAverage = assgAvg * 0.5 + examAvg * 0.5;
                        else overallAverage = assgCount > 0 ? assgAvg : examAvg;
                        System.out.println("\n===== CURREN RESULTS =====");
                        System.out.println("Assignments completed: " + assgCount);
                        System.out.println("Assignment average: " + assgAvg);
                        System.out.println("Exams completed: " + exCount);
                        System.out.println("Exam average: " + examAvg);
                        System.out.println("Overall average: " + overallAverage);
                        if (overallAverage >= 90) {
                            System.out.println("Grade: A");
                            ch = 'A';
                        } else if (overallAverage >= 80 && overallAverage < 90) {
                            System.out.println("Grade: B");
                            ch = 'B';
                        } else if (overallAverage >= 70 && overallAverage < 80) {
                            System.out.println();
                            ch = 'C';
                        } else if (overallAverage >= 60 && overallAverage < 70) {
                            ch = 'D';
                        } else if (overallAverage < 60) {
                            System.out.println("Grade: F");
                            ch = 'F';
                        }
                    } else {
                        System.out.println("No results available yet");
                    }
                    break;

                case 4:
                    System.out.println("GOOD LUCK!!!");
                    break;

            }

        }

    }
}
