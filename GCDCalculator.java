import java.util.Scanner;
public class GCDCalculator {
    public static void main(String[] args){
        GCDCalc gcdObj=new GCDCalc();
        gcdObj.gcdFinder();
    }
}
class GCDCalc{
    Scanner scanObj=new Scanner(System.in);
    public void gcdFinder(){
        int a=scanObj.nextInt();
        int b=scanObj.nextInt();
        int num1=a;
        int num2=b;
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.println("The greatest common divisor of "+a+" & "+b+" is "+num1);
    }
}