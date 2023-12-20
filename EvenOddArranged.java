//import java.util.ArrayList;
public class EvenOddArranged {
    public static void main(String[] args) {
        FilterNumArray filterer=new FilterNumArray();
        SortingNumArrays sorter=new SortingNumArrays();
        int[] unorderedNums = {9, 2, 3, 8, 7, 1, 0, 4, 6, 5, 10};
        int[] oddNumberArray= filterer.filterOdsNumbers(unorderedNums);
        int[] evenNumberArray= filterer.filterEvenNumbers(unorderedNums);
        int[] orderedOddNums= sorter.ascendindOrder(oddNumberArray);
        int[] orderedEvenNums= sorter.descendindOrder(evenNumberArray);
        int[] orderedArray=new int[orderedEvenNums.length + orderedOddNums.length];
        for(int i=0; i<orderedOddNums.length; i++){
            orderedArray[i]=orderedOddNums[i];
        }
        for(int i=0; i<orderedEvenNums.length; i++){
            orderedArray[orderedOddNums.length+i]=orderedEvenNums[i];
        }
        for (int i:orderedArray){
            System.out.print(i+", ");
        }
    }
}
class FilterNumArray {
    int[] filterEvenNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] numArr = new int[count];
        int index = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                numArr[index++] = i;
            }
        }
        return numArr;
    }
    int[] filterOdsNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] numArr = new int[count];
        int index = 0;
        for (int i : nums) {
            if (i % 2 != 0) {
                numArr[index++] = i;
            }
        }
        return numArr;
    }
}
class SortingNumArrays{
    int[] ascendindOrder(int[] arr){
        int[] sortedArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sortedArr[i]=arr[i];
        }
        for(int i=0;i<sortedArr.length-1;i++){
            for(int j=0;j<sortedArr.length-i-1;j++){
                if(sortedArr[j]>sortedArr[j+1]){
                    int temp=sortedArr[j];
                    sortedArr[j]=sortedArr[j+1];
                    sortedArr[j+1]=temp;
                }
            }
        }
        return sortedArr;
    }
    int[] descendindOrder(int[] arr){
        int[] sortedArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sortedArr[i]=arr[i];
        }
        for(int i=0;i<sortedArr.length-1;i++){
            for(int j=0;j<sortedArr.length-i-1;j++){
                if(sortedArr[j]<sortedArr[j+1]){
                    int temp=sortedArr[j];
                    sortedArr[j]=sortedArr[j+1];
                    sortedArr[j+1]=temp;
                }
            }
        }
        return sortedArr;
    }
}
