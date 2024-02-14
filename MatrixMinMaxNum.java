import java.util.Scanner;

public class MatrixMinMaxNum {
    public int findNum(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0; i<rows; i++) {
            int minRowVal = matrix[0][0];
            int maxColIdx = 0;
            for(int j=0; j<cols; j++){
                if(matrix[i][j]>minRowVal) minRowVal=matrix[i][j]; maxColIdx=j;
            }
//            System.out.println(minRowVal);
//            System.out.println(maxColIdx);
            boolean isTarget=true;
            for(int j=0; j<rows;j++){
                if(matrix[j][maxColIdx]<minRowVal){
                    isTarget=false;
                    break;
                }
            }
            if (isTarget) return minRowVal;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MatrixMinMaxNum mtxObj = new MatrixMinMaxNum();
        System.out.print("Enter no of rows in matrix: ");
        int row = scanner.nextInt();
        System.out.println();
        System.out.print("Enter no of columns in matrix: ");
        int col = scanner.nextInt();
        System.out.println();
        int[][] matrix = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter value for matrix["+i+"]["+j+"] : ");
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(mtxObj.findNum(matrix));
    }
}
//3  11  7
//5   9  14
//2   4   5