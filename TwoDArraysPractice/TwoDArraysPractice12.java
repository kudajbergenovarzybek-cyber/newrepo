package TwoDArraysPractice;

public class TwoDArraysPractice12 {
    public static void main(String[] args) {
        int[][] scores = {
                {85, 90, 78, 92},
                {70, 65, 88, 75},
                {95, 98, 91, 89}
        };

        int classMax = scores[0][0];
        int total = 0;
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                studentSum += scores[i][j];
                total += scores[i][j];
                count++;
                if (scores[i][j] > classMax) {
                    classMax = scores[i][j];
                }
            }
            double average = (double) studentSum / scores[i].length;
            System.out.println("Student " + (i + 1) + " average: " + average);
        }

        System.out.println("Class maximum: " + classMax);
        System.out.println("Overall average: " + (double) total / count);
    }
}
