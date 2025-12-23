public class StudentVoting {

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = (int)(Math.random() * 50);
        return ages;
    }

    static String[][] checkVote(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = ages[i] >= 18 ? "Can Vote" : "Cannot Vote";
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVote(ages);

        System.out.println("Age\tStatus");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
