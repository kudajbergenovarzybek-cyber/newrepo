import java.util.Scanner;

public class LoopTask6 {
    public static void main(String[] args){
        Scanner even = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num2 = even.nextInt();
        int num1 = 1;
        while (num1 <= num2){
            System.out.println(num1);
            num1 += 2;
        }
        System.out.println();
        System.out.println();
        for(num1 = 1; num1 <= num2; num1 += 2){
            System.out.println(num1);
        }
        System.out.println();
        System.out.println();
        int donum = 1;
        do {
            System.out.println(donum);
            donum +=2;
        }while (donum <= num2);
    }
}
