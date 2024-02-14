import java.util.Scanner;
public class CircularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularMatrix cmObj = new CircularMatrix();
        System.out.print("Enter degree of matrix: ");
        int n = scanner.nextInt();
        System.out.println();
        int[][] matrix = new int[n][n];
        matrix=cmObj.fillCircularMatrix(matrix, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private int[][] fillCircularMatrix(int[][] matrix, int n) {
        int num = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        while (true) {
            if (left > right) {
                break;
            }
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            if (top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            if (left > right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;
            if (top > bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }
}