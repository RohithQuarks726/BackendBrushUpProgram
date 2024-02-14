import java.util.Scanner;

public class MonotonyChecker {
    public void checkMonotony(int[] arr){
        boolean a = false;
        boolean d = false;
        for(int i=0; i<arr.length-2; i++){
            if(arr[i]>arr[i+1]){
                d=true;
            } else if (arr[i]<arr[i+1]) {
                a=true;
            }
        }
        if(a&&d){
            System.out.println("Not monotonous");
        }else {
            System.out.println("Monotonous");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonotonyChecker mch = new MonotonyChecker();
        System.out.print("Enter no of elements in arr: ");
        int n = scanner.nextInt();
        System.out.println();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element: ");
            arr[i]=scanner.nextInt();
            System.out.println();
        }
        mch.checkMonotony(arr);
    }
}