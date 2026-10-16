public class LoopTask7 {
    public static void main(String[] args){
        int value = 1;
        do {
            if ((value % 3 == 0) & (value % 5 == 0))
                System.out.println(value + " : FizzBuzz");
            else if (value % 3 == 0)
                System.out.println(value + " : Fizz");
            else if (value % 5 == 0)
                System.out.println(value + " : Buzz");
            else {
                System.out.println(value);
            }
            value += 1;
        } while (value <= 20);
    }
}
