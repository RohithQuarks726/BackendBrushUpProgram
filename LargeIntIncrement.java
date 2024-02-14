import java.util.Scanner;

public class LargeIntIncrement {
    public int[] incrementByOne(int[] arr){
        int[] longArr = new int[arr.length+1];
        String str="";
        for(int i=0; i<arr.length; i++){
            str+=arr[i];
        }
        int num=Integer.parseInt(str);
        num++;
        str=""+num;
        if(str.length()>arr.length) {
            for (int i = 0; i < str.length(); i++){
                longArr[i]=Integer.parseInt(""+str.charAt(i));
            }
            return longArr;
        } else {
            for (int i = 0; i < str.length(); i++){
                arr[i]=Integer.parseInt(""+str.charAt(i));
            }
            return arr;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LargeIntIncrement obj = new LargeIntIncrement();
        System.out.print("Enter no of digits: ");
        int n = scanner.nextInt();
        System.out.println();
        int[] arr = new int[n];
        System.out.println("Enter digits");
        for(int j=0; j<n; j++){
            arr[j]=scanner.nextInt();
        }
        arr= obj.incrementByOne(arr);
        System.out.print("[ ");
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length-1]+"]");
    }
}