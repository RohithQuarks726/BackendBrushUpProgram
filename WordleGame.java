import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class WordleGame {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        GameBase gameObj=new GameBase();
        System.out.println("Difficulty:");
        System.out.println("Easy - 1");
        System.out.println("Medium - 2");
        System.out.println("Hard - 3");
        System.out.print("Enter difficulty to start playing : ");
        int ch=scan.nextInt();
        scan.nextLine();
        if(ch==1){
            gameObj.wordCheckerEasy();
        } else if (ch==2) {
            gameObj.wordCheckerMedium();
        }else if(ch==3){
            gameObj.wordCheckerHard();
        }else{
            System.out.println("Enter valid difficulty");
        }
    }
}
class GameBase{
    Scanner scanObj=new Scanner(System.in);
    String word;
    String[] fiveLetterWords={"maple", "tiger", "bliss", "jumbo", "flute", "chime", "olive", "horse", "quirk", "zebra", "grasp", "flame", "knack", "pixel", "mirth", "swoop", "coral", "quest", "smash", "fable"};
    String[] sixLetterWords={"marvel", "impact", "wisdom", "arctic", "jigsaw", "orbits", "canyon", "spirit", "castle", "design", "effort", "frozen", "gravel", "hammer", "insect", "juggle", "kettle", "lagoon", "mellow", "nectar"};
    String[] sevenLetterWords={"journey", "package", "venture", "freedom", "bicycle", "scribes", "balance", "weather", "library", "tension", "dynamic", "foresee", "express", "fantasy", "harmony", "justice", "lantern", "machine", "orbital", "Premium"};
    public String randomWord(String[] arr){
        Random random= new Random();
        String word=arr[random.nextInt(arr.length)];
//        System.out.println(word);
        return word;
    }
    public void wordCheckerEasy(){
        String computerWord=randomWord(fiveLetterWords);
//        String[] letterArray=toArray(computerWord);
        for(int i=5; i>=0;i--) {
            System.out.println("Try:"+i+" Enter word: ");
            word=scanObj.nextLine().toLowerCase(Locale.ROOT);
            if (word.equals(computerWord)) {
                System.out.println("\u001B[34m" + word + "\u001B[34m");
                System.out.print("\u001B[0m");
                System.out.println("Hoooooooooooooorrrrrrraaaaaaaaaaaaaaahhhhhhhhh!!!!!!!!!!!!!!!!");
                return;
            } else {
                for (int j = 0; j < word.length(); j++) {
                    if ((""+word.charAt(j)).equals(""+computerWord.charAt(j))) {
                        System.out.print("\u001B[34m" + word.charAt(j) + "\u001B[34m");
                        System.out.print("\u001B[0m");
                    } else if (word.charAt(j) != computerWord.charAt(j) && wordContains(computerWord, word.charAt(j))) {
                        System.out.print("\u001B[31m" + word.charAt(j) + "\u001B[31m");
                        System.out.print("\u001B[0m");
                    } else{
                        System.out.print(""+word.charAt(j));
                    }
//                    System.out.println("the word you were looking for is "+computerWord);
                }
                System.out.println();
//                System.out.println("the word you were looking for is "+computerWord);
            }
        }
        System.out.println("the word you were looking for is "+computerWord);
    }
    public void wordCheckerMedium(){
        String computerWord=randomWord(sixLetterWords);
//        System.out.println(computerWord);
//        String[] letterArray=toArray(computerWord);
        for(int i=5; i>=0;i--){
            System.out.println("Try:"+i+" Enter word: ");
            word=scanObj.nextLine().toLowerCase(Locale.ROOT);
            if(word.equals(computerWord)){
                System.out.println("\u001B[34m"+word+"\u001B[34m");
                System.out.print("\u001B[0m");
                System.out.println("Hoooooooooooooorrrrrrraaaaaaaaaaaaaaahhhhhhhhh!!!!!!!!!!!!!!!!");
                return;
            } else{
                for(int j=0;j<word.length();j++){
                    if (word.charAt(j)==computerWord.charAt(j)){
                        System.out.print("\u001B[34m"+word.charAt(j)+"\u001B[34m");
                        System.out.print("\u001B[0m");
                    } else if (word.charAt(j)!=computerWord.charAt(j)&&wordContains(computerWord,word.charAt(j))){
                        System.out.print("\u001B[31m"+word.charAt(j));
                        System.out.print("\u001B[0m");
                    }else{
                        System.out.print(""+word.charAt(j));
                    }
                }
//                System.out.println("the word you were looking for is "+computerWord);
                System.out.println();
            }
        }
        System.out.println("the word you were looking for is "+computerWord);
    }
    public void wordCheckerHard(){
        String computerWord=randomWord(sevenLetterWords);
//        String[] letterArray=toArray(computerWord);
        for(int i=5; i>=0;i--) {
            System.out.println("Try:"+i+" Enter word: ");
            word=scanObj.nextLine().toLowerCase(Locale.ROOT);
            if (word.equals(computerWord)) {
                System.out.println("\u001B[34m" + word + "\u001B[34m");
                System.out.print("\u001B[0m");
                System.out.println("Hoooooooooooooorrrrrrraaaaaaaaaaaaaaahhhhhhhhh!!!!!!!!!!!!!!!!");
                return;
            } else {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == computerWord.charAt(j)) {
                        System.out.print("\u001B[34m" + word.charAt(j) + "\u001B[34m");
                        System.out.print("\u001B[0m");
                    } else if (word.charAt(j) != computerWord.charAt(j) && wordContains(computerWord, word.charAt(j))) {
                        System.out.print("\u001B[31m" + word.charAt(j));
                        System.out.print("\u001B[0m");
                    } else{
                        System.out.print(""+word.charAt(j));
                    }
                }
//                System.out.println("the word you were looking for is "+computerWord);
                System.out.println();
            }
        }
        System.out.println("the word you were looking for is "+computerWord);
    }
//    private String[] toArray(String word){
//        String[] arr=new String[word.length()];
//        for(int i=0;i<word.length();i++){
//            arr[i]=""+word.charAt(i);
//        }
//        return arr;
//    }
    private boolean wordContains(String word, char ch){
        for(int i=0;i<word.length();i++){
            if(("" + word.charAt(i)).equals("" + (ch))){
                return true;
            }
        }
        return false;
    }
}