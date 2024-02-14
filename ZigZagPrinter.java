import java.util.Scanner;

public class ZigZagPrinter {
    public void zigzag(String word, int n){
        String[] zigzag=new String[n];
        for(int i=0; i<zigzag.length; i++){
            zigzag[i]="";
        }
        int index=0;
        boolean down=true;
        for(int i=0; i<word.length(); i++){
            zigzag[index]+=word.charAt(i);
            if(index==0) down=true;
            else if (index==n-1) down=false;
            if(down) index+=1; else index-=1;
        }
        String newWord="";
        for(String str: zigzag){
            newWord+=str;
        }
        System.out.println("Output: "+newWord);
    }
    public static void main(String[] args){
        ZigZagPrinter zzp = new ZigZagPrinter();
        Scanner scanObj = new Scanner(System.in);
        System.out.print("Enter no of rows:  ");
        int n = scanObj.nextInt();
        scanObj.nextLine();
        System.out.print("Input word: ");
        String word=scanObj.nextLine();
        zzp.zigzag(word, n);
    }
}