import java.util.Scanner;

public class LoopTask5 {
    public static void main(String[] args){
        Scanner even = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num2 = even.nextInt();
        int num1 = 2;
        while (num1 <= num2){
            System.out.println(num1);
            num1 += 2;
        }
        System.out.println();
        System.out.println();
        for(num1 = 2; num1 <= num2; num1 += 2){
            System.out.println(num1);
        }
        System.out.println();
        System.out.println();
        int donum = 0;
        do {
            donum +=2;
            if (donum <= num2)
                System.out.println(donum);
        }while (donum < num2);
    }
}
