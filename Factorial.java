import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        FactorialOfNum factobj=new FactorialOfNum();
        factobj.factorialOfNum();
    }
}
class FactorialOfNum{
    Scanner scanObj=new Scanner(System.in);
    public void factorialOfNum(){
        int num=scanObj.nextInt();
        int temp=1;
        for(int i=1;i<=num;i++){
            temp*=i;
        }
        System.out.println("The factorial of "+num+" is "+temp);
    }
}