package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sd.parse(str);
        System.out.println(date);
        long day=kb.nextLong();
        long time=date.getTime()+(day*24*60*60*1000);
        System.out.println(time);
        Date date1=new Date(time);
        System.out.println(date1);
        Calendar cal=Calendar.getInstance();
        cal.setTime(date1);
        cal.add(Calendar.WEEK_OF_YEAR,-2);
        cal.set(Calendar.DAY_OF_WEEK,3);
        System.out.println("促销日期是"+cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DAY_OF_MONTH));
    }
}
