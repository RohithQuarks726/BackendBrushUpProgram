import java.util.Scanner;
public class AddCheckPoints {
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14, 15};
        for(int i:array) System.out.print(i+" ");
        System.out.println();
        Scanner scanObj=new Scanner(System.in);
        System.out.print("Enter k value:");
        int k= scanObj.nextInt();
        System.out.println();
        AddJumps jumper=new AddJumps();
        jumper.sumOfCheckPoints(array,k);
    }
}
class AddJumps{
    public void sumOfCheckPoints (int[] arr,int k) {
        int[] nums = arr;
        int n = k;
        while (nums.length != 0) {
            int c=0;
            int[] newNums = new int[nums.length / n+(nums.length%k>0?1:0)];
            for (int i = 0; i < nums.length; i++) {
                if (i%n==0){
                    newNums[c++]=nums[i];
                }
            }
            int counter=0;
            for(int i=0; i<c;i++){
                counter+=newNums[i];
            }
            System.out.println(counter);
            nums=newNums;
            if(nums.length==1)break;
        }
    }
}
