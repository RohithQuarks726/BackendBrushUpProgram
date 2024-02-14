import java.util.Random;

public class CaptchaGenerator {
    public static void main(String args[]) {
        CapGen capObj = new CapGen();
        String Captcha=capObj.captcha();
        System.out.println(Captcha);
    }
}
class CapGen{
    Random ranObj=new Random();
    public String captcha(){
        int n=Math.round(ranObj.nextInt(4,8));
        String captcha="";
        String captchaLetters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i=0; i<n;i++){
            captcha+=captchaLetters.charAt(Math.round(ranObj.nextInt(0,captchaLetters.length())));
        }
        return captcha;
    }
}