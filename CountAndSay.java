public class CountAndSay {
    public static void main(String args[]) {
        Sequence num = new Sequence();
        num.result(3334451);
    }
}
class Sequence{
    public void result(int n){
        String str="";
        String count="";
        String num="";
        String number=(""+n);
        for(int i=0; i<number.length(); i++) {
            if (!str.contains(""+number.charAt(i))){
                str+=""+number.charAt(i);
            }
        }
        for(int i=0; i<str.length();i++){
            int c=0;
            for(int j=0; j<number.length();j++){
                if(str.charAt(i)==number.charAt(j)){c++;}
            }
            count+=c;
        }
        for(int i=0; i<str.length(); i++){
            num=num+count.charAt(i)+str.charAt(i);
        }
        System.out.println("input: "+number);
        System.out.println("output: "+num);
    }
}