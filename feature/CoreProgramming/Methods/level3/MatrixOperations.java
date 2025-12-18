public class MatrixOperations {

    /* ---------------- MATRIX CREATION ---------------- */

    // Create random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // 0–9
            }
        }
        return matrix;
    }

    /* ---------------- DISPLAY MATRIX ---------------- */

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    /* ---------------- ADDITION ---------------- */

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    /* ---------------- SUBTRACTION ---------------- */

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    /* ---------------- MULTIPLICATION ---------------- */

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    /* ---------------- TRANSPOSE ---------------- */

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }

    /* ---------------- DETERMINANT (2x2) ---------------- */

    public static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    /* ---------------- DETERMINANT (3x3) ---------------- */

    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    /* ---------------- INVERSE (2x2) ---------------- */

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    /* ---------------- INVERSE (3x3) ---------------- */

    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double) det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double) det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double) det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double) det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double) det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double) det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double) det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double) det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double) det;

        return inv;
    }

    /* ---------------- MAIN ---------------- */

    public static void main(String[] args) {

        int[][] A = createRandomMatrix(3, 3);
        int[][] B = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("A + B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("A × B:");
        displayMatrix(multiplyMatrices(A, B));

        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("Determinant of A (3x3): " + determinant3x3(A));

        double[][] inv = inverse3x3(A);
        if (inv != null) {
            System.out.println("Inverse of A:");
            for (double[] row : inv) {
                for (double val : row)
                    System.out.printf("%8.3f", val);
                System.out.println();
            }
        } else {
            System.out.println("Inverse does not exist.");
        }
    }
}
