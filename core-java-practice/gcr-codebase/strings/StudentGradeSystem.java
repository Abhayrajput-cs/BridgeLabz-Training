import java.util.Scanner;

public class StudentGradeSystem {

    // a. Generate random 2-digit PCM scores
    static int[][] generateScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10; // Physics
            scores[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }
        return scores;
    }


    // b. Calculate total, average, percentage
    static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            // Round to 2 decimal places
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }

    // c. Calculate grade
    static String[][] calculateGrade(double[][] result) {

        String[][] grades = new String[result.length][1];

        for (int i = 0; i < result.length; i++) {

            double percent = result[i][2];

            if (percent >= 80) grades[i][0] = "A";
            else if (percent >= 70) grades[i][0] = "B";
            else if (percent >= 60) grades[i][0] = "C";
            else if (percent >= 50) grades[i][0] = "D";
            else if (percent >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }

    // d. Display scorecard
    static void displayScorecard(int[][] scores, double[][] result, String[][] grade) {

        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade[i][0]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] result = calculateResults(scores);
        String[][] grade = calculateGrade(result);

        displayScorecard(scores, result, grade);
    }
}
