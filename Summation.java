import java.util.Scanner;
public class Summation {
    public static void main(String[] args) {
        AddNNumbers sumObj = new AddNNumbers();
        sumObj.addNumbersTill();
    }
}
class AddNNumbers{
    Scanner scanObj=new Scanner(System.in);
    public void addNumbersTill(){
        int num=scanObj.nextInt();
        int temp=0;
        for(int i=1;i<=num;i++){
            temp+=i;
        }
        System.out.println("The sum of "+num+" number of natural numbers is "+temp);
    }
}