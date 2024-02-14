import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ArrayManipulator {
    int[] data;
    public ArrayManipulator(int[] data){
        this.data=data;
    }

    public int[] add(int n){
        int[] newData= new int[data.length+1];
        for(int i=0; i<data.length; i++){
            newData[i]=data[i];
        }
        newData[newData.length-1]=n;
        data=newData;
        return newData;
    }
    public int[] remove(int n){
        int[] newData= new int[data.length-1];
        int m=0;
            for(int i=0; i<data.length; i++){
                if(i!=n){
                    newData[m]=data[i];
                    m++;
                }
            }
        data=newData;
        return newData;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in arr: ");
        int n = scan.nextInt();
        System.out.println();
        int[] data=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element no. "+(i+1)+": ");
            data[i]=scan.nextInt();
        }
        ArrayManipulator arrObj = new ArrayManipulator(data);
        int[] newArr=arrObj.add(35);
        for(int i:newArr) System.out.print(i+" ");
        System.out.println();
        int[] newArr1=arrObj.remove(2);
        for(int i:newArr1) System.out.print(i+" ");
        System.out.println();
    }
}