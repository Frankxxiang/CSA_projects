import java.util.Scanner;

public class MatrixAdditionExample {
    public static void main(String[] args) {
        int[][] MatrixA=new int[3][3];
        int[][] MatrixB=new int[3][3];
        int[][] Result=new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enther the elements for MatrixA:");
        for (int i = 0; i<MatrixA.length;i++){
            for (int j=0;j<MatrixA[0].length;j++){
                MatrixA[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements for MatrixB: ");
        for (int i = 0; i<MatrixB.length;i++){
            for (int j=0;j<MatrixB[0].length;j++){
                MatrixB[i][j]=sc.nextInt();
                Result[i][j]=MatrixB[i][j]+MatrixA[i][j];
            }
        }
        
        System.out.println("Result of Addition of 2 Matrix:");
        for (int i=0;i<Result.length;i++){
            for (int clm : Result[i]){
                System.out.print(clm+"\t");
            }
            System.out.println(" ");
        }

    }
}
