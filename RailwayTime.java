import java.sql.Time;
import java.util.Scanner;

public class RailwayTime {
    public String Time(String str){
        String newTime="";
        int hour=Integer.parseInt(str.substring(0,2));
        int min=Integer.parseInt(str.substring(3,5));
        int sec=Integer.parseInt(str.substring(6,8));
        if(str.substring(9).equals("pm")){
            newTime=newTime+(hour+12)+":"+min+":"+sec;
            return newTime;
        } else{
            return str.substring(0,8);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        RailwayTime timeObj = new RailwayTime();
        System.out.print("Enter time to convert: ");
        String time=scanner.nextLine();
        String newTime= timeObj.Time(time);
        System.out.println(newTime);
    }
}