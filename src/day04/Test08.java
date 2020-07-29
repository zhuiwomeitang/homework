package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *2020-12-12  2098-09-23 2031-04-12
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner kb=new Scanner(System.in);
        List<Date>list=new ArrayList<>();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-DD");
        for(int i=0;i<3;i++){
            String sc=kb.next();
            Date date=sf.parse(sc);
        list.add(date);}
        Collections.sort(list);
        System.out.println(list);
    }
}
