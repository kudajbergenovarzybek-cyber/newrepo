public class LoopTask1 {
    public static void main(String[] args){
        int i = 1;
        while (i <= 1000){
            System.out.print(i);
            i *= 10;
            System.out.println(" * 10 = " + i);
        }
    }
}
