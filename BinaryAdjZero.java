import java.util.Scanner;

public class BinaryAdjZero {
    public String isAdjZeroExists(String n){
        for (int i=1; i<n.length()-1; i++){
            if((n.charAt(i)=='0'&&n.charAt(i-1)=='0')||(n.charAt(i)=='0'&&n.charAt(i+1)=='0')){
                return "yes";
            }
        }
        return "no";
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BinaryAdjZero obj = new BinaryAdjZero();
        System.out.print("Enter no of test cases: ");
        int t = scanner.nextInt();
        System.out.println();
        int[] arr = new int[t];
        for(int i = 0; i<t; i++){
            arr[i]=scanner.nextInt();
        }
        for(int i = 0; i<t; i++){
            System.out.println(obj.isAdjZeroExists(""+arr[i]));
        }
    }
}