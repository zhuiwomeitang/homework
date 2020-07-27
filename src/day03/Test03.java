package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner kb=new Scanner(System.in);
        String sc=kb.next();
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sd.parse(sc);
        long time=date.getTime();
        Date date1=new Date();
        long time1=date1.getTime();
        long time2=time1-time;
       int week= (int)(time2/1000/60/60/24/7);
        System.out.println(week);
    }
}
