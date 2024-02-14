import java.util.Scanner;
public class NRotations {
    int[] arr;
    public void rotateNTimes(int n){
        int[] newArr = new int[arr.length];
        int z=0;
        for(int i=n; i<arr.length; i++){
            newArr[z]=arr[i];
            z++;
        }
        for (int i=0; i<n; i++){
            newArr[z]=arr[i];
            z++;
        }
        System.out.print("[ ");
        for(int i=0; i<newArr.length-1;i++){
            System.out.print(newArr[i]+", ");
        }
        System.out.print(newArr[newArr.length-1]+"]");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        NRotations obj = new NRotations();
        System.out.print("Enter no. of elements: ");
        int k = scanner.nextInt();
        System.out.println();
        int[] arr=new int[k];
        for(int i=0; i<k; i++){
            System.out.print("Enter element"+ (i+1) +": ");
            arr[i]=scanner.nextInt();
            System.out.println();
        }
        System.out.print("Enter no. of rotations: ");
        int n = scanner.nextInt();
        System.out.println();
        obj.arr=arr;
        obj.rotateNTimes(n);
    }
}