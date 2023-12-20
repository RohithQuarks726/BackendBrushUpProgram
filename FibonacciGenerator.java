import java.util.Scanner;
public class FibonacciGenerator {
    public static void main(String[] args){
        FibonacciSequence fibObj=new FibonacciSequence();
        fibObj.FibonacciSequence();
    }
}
class FibonacciSequence{
    Scanner scanObj=new Scanner(System.in);
    public void FibonacciSequence(){
        int num=scanObj.nextInt();
        if(num==1){
            System.out.println("0");
        }else if(num==2){
            System.out.println("1");
        }
        else {
            System.out.print("0  ");
            int[] tempArr = {0, 1};
            for (int i = 3; i <= num; i++) {
                int temp = tempArr[0] + tempArr[1];
                tempArr[0]=tempArr[1];
                tempArr[1] = temp;
                System.out.print(tempArr[0]+"  ");
            }
            System.out.print(tempArr[1]);
        }
    }
}