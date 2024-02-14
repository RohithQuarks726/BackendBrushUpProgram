import java.util.Scanner;

public class BallInTheGrid {
    int row;
    int col;
    int[][] Grid;
    public BallInTheGrid(int row, int col){
        this.row=row;
        this.col=col;
        this.Grid=new int[row][col];
    }
    public void Grid(int ballPos){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++) {
                if(i==4 && j==ballPos) Grid[i][j] = 1; else Grid[i][j] = 0;
            }
        }
//        System.out.println("Completed!");
    }
    public void Grid(){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++) {
                System.out.print(Grid[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scanObj = new Scanner(System.in);
        System.out.print("No of rows: ");
        int n=scanObj.nextInt();
        System.out.println();
        System.out.print("No of columns: ");
        int m=scanObj.nextInt();
        System.out.println();
        BallInTheGrid gridObj = new BallInTheGrid(n,m);
        System.out.print("Initial Ball position: ");
        int k=scanObj.nextInt();
        System.out.println();
        gridObj.Grid(k);
        gridObj.Grid();
//        boolean y= true;
        int ch;
        while(true){
            System.out.println("Menu:-");
            System.out.println("1. move ball. (shifts ball position.)");
            System.out.println("2. show grid. (prints latest grid.)");
            System.out.println("3. terminate. (terminates the program.)");
            ch=scanObj.nextInt();
            if(ch==1){
                System.out.print("Enter new ball position: ");
                int ballPos=scanObj.nextInt();
                gridObj.Grid(ballPos);
                System.out.println("Completed!");
            } else if (ch==2) {
                gridObj.Grid();
            }else {
//                y = false;
                System.out.println("terminated!");
                break;
            }
        }
    }
}