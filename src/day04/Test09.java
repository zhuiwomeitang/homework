package day04;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner kb=new Scanner(System.in);
        String sc=kb.next();
        String regex=";";
        String[] split = sc.split(regex);
        String regex1=",";
        Collection<Emp>emps=new ArrayList<>();
        for(int i=0;i<split.length;i++){
            String[] b = split[i].split(regex1);
            SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
           Date date=sf.parse(b[4]);
           Integer x=Integer.parseInt(b[1]);
           Integer s=Integer.parseInt(b[3]);
           Emp emp=new Emp(b[0],x,b[2],s,date);
           emps.add(emp);
        }
        for(Emp s:emps){
            System.out.println(s.toString());
            Date date=s.hiredate;
            Calendar cal=Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH,3);
            cal.set(Calendar.DAY_OF_WEEK,5);
            System.out.println("转正日期："+cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DAY_OF_MONTH));
        }

    }
}
