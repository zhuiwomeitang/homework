package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 * 33082119920715601X
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        String regex="\\d{18}|(\\d{17}[X]{1})";
         System.out.println("请输入身份证号码");
         Scanner kb=new Scanner(System.in);
          String str=kb.next();
        while(str.matches(regex) != true) {
           System.out.println("请重新输入号码");
               str = kb.next();
             }
                String str1=str.substring(6,14);
                String str2=str.substring(6,10);
                String str3=str.substring(10,12);
                String str4=str.substring(12,14);
              SimpleDateFormat sf=new SimpleDateFormat("yyyyMMdd");
              Date date=sf.parse(str1);System.out.println("出生日期:" +str2+"-"+str3+"-"+str4);
              Calendar cal=Calendar.getInstance();
              cal.setTime(date); System.out.println("20岁生日:"+cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DAY_OF_MONTH));
              cal.add(Calendar.YEAR,20);
              cal.set(Calendar.DAY_OF_WEEK,3);
              cal.set(Calendar.WEEK_OF_MONTH,cal.get(Calendar.WEEK_OF_MONTH));
              System.out.println("当周的周三为:"+cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DAY_OF_MONTH));



        }

    }

