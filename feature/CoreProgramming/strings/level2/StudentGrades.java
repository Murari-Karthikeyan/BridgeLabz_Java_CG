public class StudentGrades {

    static int[][] generatePCM(int n) {
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                pcm[i][j] = 10 + (int)(Math.random() * 90);
        return pcm;
    }

    static double[][] calculate(int[][] pcm) {
        double[][] res = new double[pcm.length][3];
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            res[i][0] = total;
            res[i][1] = total / 3.0;
            res[i][2] = Math.round((total / 300.0) * 10000) / 100.0;
        }
        return res;
    }

    static char grade(double p) {
        if (p >= 80) return 'A';
        if (p >= 70) return 'B';
        if (p >= 60) return 'C';
        if (p >= 50) return 'D';
        if (p >= 40) return 'E';
        return 'R';
    }

    public static void main(String[] args) {
        int[][] pcm = generatePCM(5);
        double[][] res = calculate(pcm);

        System.out.println("P\tC\tM\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < pcm.length; i++) {
            System.out.println(pcm[i][0] + "\t" + pcm[i][1] + "\t" + pcm[i][2]
                    + "\t" + res[i][0] + "\t" + res[i][1] + "\t" + res[i][2]
                    + "\t" + grade(res[i][2]));
        }
    }
}
