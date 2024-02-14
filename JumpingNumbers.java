import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JumpingNumbers {
    public void findJumpingNumbers(int ll, int ul){
        Queue<Integer> arr=new LinkedList<>();
        for(int i=ll; i<=ul; i++){
            char[] charArr=(""+i).toCharArray();
            int[] intArr = new int[charArr.length];
            boolean validDiff = true;
            boolean firstLast = false;
            for(int k=0; k<intArr.length; k++){
                intArr[k]=Integer.parseInt(""+charArr[k]);
            }
            for(int x=1; x<intArr.length-1; x++){
                if(!(Math.abs(intArr[x]-intArr[x-1])==1 && Math.abs(intArr[x]-intArr[x+1])==1)){
                    validDiff=false;
                }
            }
            if(Math.abs(intArr[0]-intArr[intArr.length-1])==1) firstLast=true;
            if(validDiff && firstLast){
                arr.offer(i);
            }
        }
        System.out.println(arr);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        JumpingNumbers numObj = new JumpingNumbers();
        System.out.print("Enter lower limit: ");
        int ll = scanner.nextInt();
        System.out.println();
        System.out.print("Enter upper limit: ");
        int ul = scanner.nextInt();
        System.out.println();
        numObj.findJumpingNumbers(ll,ul);
    }
}
