import java.util.Scanner;

public class SubstringFinder {
    public int findSubstring(String s1, String s2){
        for(int i=0; i<=(s1.length()-s2.length()); i++){
            if(s1.substring(i,i+s2.length()).equals(s2)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        SubstringFinder obj = new SubstringFinder();
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("Output: "+obj.findSubstring(s1,s2));
    }
}
