import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public  static void moveZero(int[] nums){
        if(nums == null||nums.length == 0 ) return;
        int notZero =0;
        for(int i =0;i<nums.length;i++){
            if (nums[i] != 0) nums[notZero++] = nums[i];

        }
        while (notZero < nums.length){
            nums[notZero++]=0;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        moveZero(nums);

        System.out.println("Array after moving zeros: " + Arrays.toString(nums));
    }
}