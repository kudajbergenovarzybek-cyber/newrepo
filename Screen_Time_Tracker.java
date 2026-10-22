
import java.util.Scanner;

public class Screen_Time_Tracker {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        int soc = 0;
        int gam = 0;
        int stu = 0;
        int vid = 0;
        int rec = 0;
        int total;
        int Entertainment;
        int Productive;

        while(choice != 6){
            System.out.println("\n===== SCREEN-TIME TRACKER =====");
            System.out.println("1. Add social media time");
            System.out.println("2. Add gaming time");
            System.out.println("3. Add studying time");
            System.out.println("4. Add video or streaming time");
            System.out.println("5. View statistics");
            System.out.println("6. Exit");
            System.out.println("Choose option: ");
            choice = sc.nextInt();

            int min;
            if(choice > 0 && choice <= 6) {
                switch (choice) {
                    case 1:
                        System.out.println("Enter social media minutes: ");
                        min = sc.nextInt();
                        soc += min;
                        rec ++;
                        System.out.println("Time added successfully!");
                        break;
                    case 2:
                        System.out.println("Enter game minutes: ");
                        min = sc.nextInt();
                        gam += min;
                        rec ++;
                        System.out.println("Time added successfully!");
                        break;
                    case 3:
                        System.out.println("Enter studying minutes: ");
                        min = sc.nextInt();
                        stu += min;
                        rec ++;
                        System.out.println("Time added successfully!");
                        break;
                    case 4:
                        System.out.println("Enter video or streaming  minutes: ");
                        min = sc.nextInt();
                        vid += min;
                        rec ++;
                        System.out.println("Time added successfully!");
                        break;
                    case 5:
                        total = soc + gam + stu + vid;
                        Entertainment = soc + gam + vid;
                        Productive = stu;
                        System.out.println("===== TODAY'S SCREEN TIME =====");
                        System.out.println("Social media: " + soc);
                        System.out.println("Gaming: " + gam);
                        System.out.println("Studying: " + stu);
                        System.out.println("Streaming: " + vid);
                        System.out.println("Total screen time: " + total );
                        System.out.println("Recorded sesion: " + rec);

                        if(Entertainment > Productive) System.out.println("Entertainment screen time is greater than study time.");
                        else if(Productive > Entertainment) System.out.println("Study screen time is greater than entertainment screen time. Good balance!");
                        else if(Entertainment == Productive) System.out.println("Study and entertainment screen time are equal.");

                        if(total > 240) System.out.println("High screen time");
                        else if(total > 120) System.out.println("Moderate screen time");
                        else if(total < 120) System.out.println("Low screen time");
                        break;
                    case 6:
                        System.out.println("Screen-time tracker closed.");
                        break;
                }
            }
        }


    }


}