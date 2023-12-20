import java.util.Scanner;
public class DigitsCounter {
    public static void main(String[] args){
        GCDCalc gcdObj=new GCDCalc();
        gcdObj.gcdFinder();
    }
}
class DigitCounter{
    Scanner scanObj=new Scanner(System.in);
    public void digitCounter(){
        long num=scanObj.nextLong();
        long a=num;
        int c=0;
        while (a!=0){
            a/=10;
            c++;
        }
        System.out.println("No of digits in "+num+" is "+c);
    }
}