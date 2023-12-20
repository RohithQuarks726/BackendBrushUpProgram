import java.util.Scanner;

public class RoundingCalculator {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        RoundingMethods operator = new RoundingMethods();
        double input = scanObj.nextDouble();
        System.out.println("Choices:");
        System.out.println("1-- To nearest hundred");
        System.out.println("2-- To nearest ten");
        System.out.println("3-- To nearest one");
        System.out.println("4-- To nearest tenth");
        System.out.println("5-- To nearest hundredth");
        int ch = scanObj.nextInt();
        if (ch == 1) {
            operator.hundredsRounding(input);
        }else if(ch == 2){
            operator.tensRounding(input);
        }else if(ch == 3){
            operator.onesRounding(input);
        }else if(ch == 4){
            operator.tenthRounding(input);
        }else if(ch == 5){
            operator.hundredthRounding(input);
        }else{
            System.out.println("Invalid input!!!");
        }
    }
}
class RoundingMethods {
    void hundredsRounding(double num){
        int temp1= (int) (num/100);
        double temp2=(num/10)%10;
        if(temp2>=5) {
            System.out.println("The number rounded to nearest ten is" + ((temp1 + 1) * 100));
        }else{
            System.out.println("The number rounded to nearest ten is" + ((temp1) * 100));
        }
    }
    void tensRounding(double num){
        int temp1= (int) (num/10);
        double temp2=num%10;
        if(temp2>=5){
            System.out.println("The number rounded to nearest ten is"+((temp1+1)*10));
        }else{
            System.out.println("The number rounded to nearest ten is"+((temp1)*10));
        }
    }
    void onesRounding(double num){
        int temp1= (int) (num);
        double temp2=(num*10)%10;
        if(temp2>=5){
            System.out.println("The number rounded to nearest ten is"+(temp1+1));
        }else{
            System.out.println("The number rounded to nearest ten is"+(temp1));
        }
    }
    void tenthRounding(double num){
        int temp1= (int) (num);
        double temp2=(num*100)%10;
        if(temp2>=5){
            System.out.println("The number rounded to nearest ten is"+((num-(num%0.1))+0.1));
        }else{
            System.out.println("The number rounded to nearest ten is"+(num-(num%0.1)));
        }
    }
    void hundredthRounding(double num){
        int temp1= (int) (num);
        double temp2=(num*1000)%10;
        if(temp2>=5){
            System.out.println("The number rounded to nearest ten is"+((num-(num%0.01))+0.01));
        }else{
            System.out.println("The number rounded to nearest ten is"+(num-(num%0.01)));
        }
    }
}
