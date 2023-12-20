import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Multiplication multiplicationObj=new Multiplication();
        multiplicationObj.multiplicationTableOf();
    }
}
class Multiplication{
    public void multiplicationTableOf(){
        Scanner scanObj=new Scanner(System.in);
        int num=scanObj.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(""+i+"*"+num+"="+(i*num));
        }
    }
}