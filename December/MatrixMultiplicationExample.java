import java.util.Scanner;
public class MatrixMultiplicationExample {

    public static void main(String[] args) {
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
        int[][] result = new int[3][3];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the elements for MatrixA:");
            fillMatrix(sc, matrixA);

            System.out.println("Enter the elements for MatrixB:");
            fillMatrix(sc, matrixB);

            // 计算两矩阵的和
            MultiplyMatrix(matrixA, matrixB, result);

            System.out.println("Result of Addition of 2 matrices:");
            printMatrix(result);
        } catch (Exception e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    private static void fillMatrix(Scanner sc, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                while (true) {
                    try {
                        System.out.print("Please Enter the" + (i + 1) + "row" + (j + 1) + "column's element: ");
                        matrix[i][j] = sc.nextInt();
                        break; // 输入正确，跳出循环
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        sc.next(); // 清除无效输入
                    }
                }
            }
        }
    }

    private static void MultiplyMatrix(int[][] matrixA, int[][] matrixB, int[][] result) {
        for (int i = 0; i < result.length; i++) { //i=0
            for (int j = 0; j < result[i].length; j++) { //j=0
                for (int r=0;r<matrixA[0].length;r++){ //r=0
                    result[i][j] += matrixA[i][r] * matrixB[r][j];
                }
                
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

