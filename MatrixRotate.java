import java.util.Scanner;

public class MatrixRotate {
    public void rotateMatrix(int[][] mtx){
        for(int i=0;i<3;i++){
            for (int j=2; j>=0;j--){
                System.out.print(mtx[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        MatrixRotate mrt = new MatrixRotate();
        int[][] mtx=new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mtx[i][j]=scan.nextInt();
            }
        }
        System.out.println("INPUT:- ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("OUTPUT:- ");
        mrt.rotateMatrix(mtx);
    }
}