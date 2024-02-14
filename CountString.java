import java.util.Scanner;
public class CountString {
    public long RepeatedACount(String s, long n) {
        long a = 0;
        long l= s.length();
        for (int i=0; i<l; i++){
            if (s.charAt(i) == 'a'){
                a++;
            }
        }
        long stringRepeat = n/l;
        long extraChar = n%l;
        long extraA = 0;
        for (int i = 0; i < extraChar; i++) {
            if (s.charAt(i) == 'a') {
                extraA++;
            }
        }
        long noOfA = (stringRepeat * a) + extraA;
        return noOfA;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CountString cObj = new CountString();
        String s = "aba";
        long n = scanner.nextInt();
        long result = cObj.RepeatedACount(s, n);
        System.out.println(result);
    }
}
