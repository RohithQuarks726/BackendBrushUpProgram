import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] Args){
        Scanner scan=new Scanner(System.in);
        PatternPrinting pattern=new PatternPrinting();
        System.out.print("Enter no of rows: ");
        int n=scan.nextInt();
        if(n<10)pattern.printNumberPattern(n);
        else System.out.println("pattern un PRINT able");
    }
}
class PatternPrinting{
    void printNumberPattern(int n){
        for(int i=0;i<n;i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n-i; k++) {
                System.out.print(n-i + " ");
            }
            System.out.println();
        }
    }
}