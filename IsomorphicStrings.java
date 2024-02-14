import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class IsomorphicStrings {
    public static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Character> mapf = new HashMap<>();
        Map<Character, Character> mapr = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);
            if (mapf.containsKey(char1) && mapf.get(char1) != char2 ||
                    mapr.containsKey(char2) && mapr.get(char2) != char1) {
                return false;
            }
            mapf.put(char1, char2);
            mapr.put(char2, char1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();
        System.out.println();
        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();
        System.out.println();
        if(areIsomorphic(s,t)){
            System.out.println("Isomorphic");
        }else{
            System.out.println("Not isomorphic");
        }
        scanner.close();
    }
}