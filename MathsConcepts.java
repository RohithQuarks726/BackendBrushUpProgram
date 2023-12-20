import java.util.Scanner;
public class MathsConcepts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MathProcesses mathObj = new MathProcesses();
        System.out.println("Menu:-------");
        System.out.println("1-- Add n Natural numbers");
        System.out.println("2-- Factorial of n");
        System.out.println("3-- Multiplication table of n");
        System.out.println("4-- Fibonacci Sequence of n elements");
        System.out.println("5-- GCD of a and b");
        System.out.println("6-- LCM of a and b");
        System.out.println("7-- Count number of digits in n");
        System.out.print("Enter choice: ");
        int ch=scanner.nextInt();
        if(ch==1)mathObj.addNumbersTill();
        else if(ch==2)mathObj.factorialOfNum();
        else if(ch==3)mathObj.multiplicationTableOf();
        else if(ch==4)mathObj.FibonacciSequence();
        else if(ch==5)mathObj.gcdFinder();
        else if(ch==6)mathObj.lcmFinder();
        else if(ch==7)mathObj.digitCounter();
        else System.out.println("Invalid choice!!!");
    }
}
class MathProcesses{
    Scanner scanObj=new Scanner(System.in);
    public void addNumbersTill(){
        int num=scanObj.nextInt();
        int temp=0;
        for(int i=1;i<=num;i++){
            temp+=i;
        }
        System.out.println("The sum of "+num+" number of natural numbers is "+temp);
    }
    public void factorialOfNum(){
        int num=scanObj.nextInt();
        int temp=1;
        for(int i=1;i<=num;i++){
            temp*=i;
        }
        System.out.println("The factorial of "+num+" is "+temp);
    }
    public void multiplicationTableOf(){
        int num=scanObj.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(""+i+"*"+num+"="+(i*num));
        }
    }
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
    public void lcmFinder(){
        int a=scanObj.nextInt();
        int b=scanObj.nextInt();
        int num1=Math.abs(a);
        int num2=Math.abs(b);
        int big;
        if(a>b)big=a; else big=a;
        while(true) {
            if (big % num1 == 0 && big % num2 == 0) {
                System.out.println("LCM of " + a + " & " + b + " is " + big);
                break;
            }
            big++;
        }
    }
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