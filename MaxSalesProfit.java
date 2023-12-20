import java.util.Scanner;
public class MaxSalesProfit {
    public static void main(String[] args){
        Scanner scanObj=new Scanner(System.in);
        Salesman salesObj=new Salesman();
        System.out.print("Enter no of days considered:  ");
        int arrLength=scanObj.nextInt();
        int[] priceArr=new int[arrLength];
        for(int i=0; i<arrLength; i++){
            System.out.println("Enter price of drugs on day-"+(i+1)+": ");
            priceArr[i]=scanObj.nextInt();
        }
        System.out.print("The price array is:  ");
        for(int i:priceArr) System.out.print(i+" ");
        System.out.println();
        salesObj.findMaxProfit(priceArr);
    }
}
class Salesman{
    void findMaxProfit(int[] prices){
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length;j++){
                if((prices[j]-prices[i])>maxProfit){
                    maxProfit=prices[j]-prices[i];
                }
            }
        }
        System.out.println("The maximum profit obtained by the salesman if he buys and sells drugs on the optimum days is "+maxProfit);
    }
}
//5 3 4 2 6 2 9 8