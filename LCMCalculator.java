import java.util.Scanner;
public class LCMCalculator {
    public static void main(String[] args){
        LCMCalc gcdObj=new LCMCalc();
        gcdObj.lcmFinder();
    }
}
class LCMCalc{
    Scanner scanObj=new Scanner(System.in);
    public void lcmFinder() {
        int a = scanObj.nextInt();
        int b = scanObj.nextInt();
        int num1 = Math.abs(a);
        int num2 = Math.abs(b);
        int big;
        if (a > b) big = a;
        else big = a;
        while (true) {
            if (big % num1 == 0 && big % num2 == 0) {
                System.out.println("LCM of " + a + " & " + b + " is " + big);
                break;
            }
            big++;
        }
    }
}