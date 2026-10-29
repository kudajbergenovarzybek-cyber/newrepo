
import java.util.Scanner;

public class GeometricFigures {

    static Scanner sc = new Scanner(System.in);

    public static int Pyramide(int height){
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return height;
    }

    public static int Triangle(int height){
        for (int i = 1; i <= height ; i++) {
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return height;
    }

    public static int Inverted(int height){
        for (int i = 1; i <= height ; height--) {
            for (int k = 0; k <= height - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return height;
    }

    public static void IPyramide(int height){
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }for (int i = 1; i <= height  ; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (height - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Square(int height){
        for (int i = 1; i <= height; i++) {
            for (int k = 1; k <= height ; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void IPy(int height){
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (height - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }



    public static void main(String[] args){

        int num, num1;

        System.out.print("Enter the number of rows: ");
        num = sc.nextInt();
        System.out.println("Choose the pattern type: " );
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.println("5 - Other");

        num1 = sc.nextInt();
        if(num1 <= 5 && num1 >= 1) {
            int num2 = 0;
            if (num1 == 5) {
                System.out.println("1 - Rhomb");
                System.out.println("2 - Square");
                System.out.print("Choose: ");
                num2 = sc.nextInt();
            }
            switch (num1) {
                case 1:
                    Triangle(num);
                    break;
                case 2:
                    Inverted(num);
                    break;
                case 3:
                    Pyramide(num);
                    break;
                case 4:
                    IPy(num);
                    break;
                case 5:
                    switch (num2) {
                        case 1:
                            IPyramide(num);
                            break;
                        case 2:
                            Square(num);
                            break;
                    }
            }
        }else{
            System.out.println("ERROR Please enter number from 1 to 5");
        }
    }
}