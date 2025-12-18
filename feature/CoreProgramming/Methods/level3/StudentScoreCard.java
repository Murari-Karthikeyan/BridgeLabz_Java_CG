public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores
    // Columns: 0-Physics, 1-Chemistry, 2-Maths
    public static int[][] generatePCMMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int) (Math.random() * 90) + 10; // 10–99
            }
        }
        return marks;
    }

    // Method to calculate Total, Average, Percentage
    // Columns: 0-Total, 1-Average, 2-Percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to determine Grade
    public static char getGrade(double percentage) {

        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] results) {

        System.out.println(
                "Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade"
        );
        System.out.println(
                "------------------------------------------------------------"
        );

        for (int i = 0; i < marks.length; i++) {
            char grade = getGrade(results[i][2]);

            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            (int) results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "\t" +
                            grade
            );
        }
    }

    public static void main(String[] args) {

        int students = 5; // You can change this value

        int[][] marks = generatePCMMarks(students);
        double[][] results = calculateResults(marks);
        displayScoreCard(marks, results);
    }
}
