import java.util.Scanner;

public class WordLengthFinder {
    public int findWordLength(String word, int n){
        String[] wordArr = word.split(" ");
        if(n<wordArr.length) {
            return wordArr[n - 1].length();
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        WordLengthFinder wordObj = new WordLengthFinder();
        System.out.print("Enter string: ");
        String word = scanner.nextLine();
        System.out.println();
        System.out.print("Enter word position: ");
        int n = scanner.nextInt();
        System.out.println();
        System.out.println(wordObj.findWordLength(word,n));
    }
}
