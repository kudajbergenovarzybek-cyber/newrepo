import java.util.Scanner;

public class Study_planner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        final int week1lyGoal = 600;
        int Prog = 0;
        int Mat = 0;
        int Eng = 0;
        int Other = 0;
        short Session = 0;
        String sub;
        int rem = 0;
        int res = 0;
        int choice = 0;
        String ent = "";

        while (!ent.equals("1") && !ent.equals("2")) {
            System.out.println("===== WELCOME =====");
            System.out.println("1. Entry to the system");
            System.out.println("2. Exit");
            ent = sc.nextLine();

            if (ent.equals("1")) {
                while (choice != 4) {
                    System.out.println("\n===== STUDY TRACKER =====");
                    System.out.println("1. Add study session");
                    System.out.println("2. View statistics");
                    System.out.println("3. Check weekly goal");
                    System.out.println("4. Exit");
                    System.out.print("Choose option: ");
                    choice = sc.nextInt();

                    int mint;


                    if (choice == 1) {
                        System.out.println("Choose subject\n");
                        System.out.println("1. Programming");
                        System.out.println("2. Mathematics");
                        System.out.println("3. English");
                        System.out.println("4. Other\n");
                        System.out.print("Choose option: ");
                        byte itr = sc.nextByte();

                        switch (itr) {
                            case 1:
                                System.out.println("===== Programming =====");
                                System.out.println("Study time in minutes: ");
                                mint = sc.nextInt();
                                Prog += mint;
                                System.out.println("Study session added!\n");
                                Session += 1;
                                System.out.println("Total time in this subj: " + Prog);
                                res += mint;
                                break;
                            case 2:
                                System.out.println("==== Mathematics ====");
                                System.out.println("Study time in minutes: ");
                                mint = sc.nextInt();
                                Mat += mint;
                                System.out.println("Study session added!\n");
                                Session += 1;
                                System.out.println("Total time in this subj: " + Mat);
                                res += mint;
                                break;
                            case 3:
                                System.out.println("==== English ====");
                                System.out.println("Study time in minutes: ");
                                mint = sc.nextInt();
                                Eng += mint;
                                System.out.println("Study session added!\n");
                                Session += 1;
                                System.out.println("Total time in this subj: " + Eng);
                                res += mint;
                                break;
                            case 4:
                                System.out.println();
                                System.out.println("How many you study in " + " : ");
                                mint = sc.nextInt();
                                Other += mint;
                                System.out.println("Study session added!\n");
                                Session += 1;
                                System.out.println("Total time in this subj: " + Other);
                                res += mint;
                                break;
                        }
                    } else if (choice == 2) {

                        System.out.println("\n===== WEEKLY STATISTICS =====");
                        System.out.println("Study session : " + Session + " minutes");
                        System.out.println("English : " + Eng + " minutes");
                        System.out.println("Programming : " + Prog + " minutes");
                        System.out.println("Mathematics : " + Mat + " minutes");
                        System.out.println("Other : " + Other + " minutes");
                    } else if (choice == 3) {
                        if (res <= 600) {
                            System.out.println("Weekly goal: " + week1lyGoal + " minutes");
                            System.out.println("You studied " + res + " minutes");
                            rem = week1lyGoal - res;
                            System.out.println("Remaining time : " + rem);
                        } else if (res > 600) {
                            System.out.println("Weekly goal achieved! " + res + " minutes");
                        } else {
                            System.out.println("ERROR");
                        }
                    } else if (choice == 4) {
                        System.out.println("Study tracker closed. Keep up the good work!");
                        if (res >= week1lyGoal) {
                            System.out.println("Weekly goal achieved! Your total time : " + res);
                        } else {
                            System.out.println("You don't achieve goal, good luck next time   Total time : " + res + " minutes");
                        }

                    }
                }
            } else if (ent.equals("2")) {
                System.out.println("GOOD LUCK!!!");

            } else {
                System.out.println("Please enter a number from 1 to 2");
            }

        }
    }
}
