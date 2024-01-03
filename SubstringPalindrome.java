import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubstringPalindrome {
    public static void main(String[] args){
        Palindrome palObj=new Palindrome();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string:");
        String s=scan.nextLine();
        System.out.println();
        System.out.println("Palindromes in the given string are: ");
        palObj.palindromeChecker(s);
    }
}
class Palindrome{
    void palindromeChecker(String S){
        String st=S.toLowerCase();
        List<String> substrings=substringGenerator(st);
        for(int i=0; i<substrings.size();i++){
            String current=substrings.get(i);
            boolean temp=true;
            int size=current.length();
            for(int j=0;j<size;j++)
                if (current.charAt(j) != current.charAt(size-j-1)) {
                    temp = false;
                    break;
                }
            if(temp) System.out.println(current);
        }
    }
    List<String> substringGenerator(String value){
        List<String> substrings= new ArrayList<>();
        for(int i=0;i<value.length();i++) {
            StringBuffer temp = new StringBuffer(value.charAt(i));
            for(int j=i+1;j<value.length()+1;j++){
                if(value.substring(i,j).length()>=2){
                    substrings.add(value.substring(i,j));
                }
            }
        }
        return substrings;
    }
}