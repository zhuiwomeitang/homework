package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-25;王五,27,男,3200,2006-02-18;李十点,45,女,5900,2007-12-14;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        List<Emp>emps=new ArrayList<>();
        String regex=";";
        String[]a=str.split(regex);
        String regex1=",";
        for(int i=0;i<a.length;i++){
            String[]b=a[i].split(regex1);
            Integer age=Integer.parseInt(b[1]);
            Integer salary=Integer.parseInt(b[3]);
            SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
            Date date=sf.parse(b[4]);
            Emp emp=new Emp(b[0],age,b[2],salary,date);
            emps.add(emp);

        }
        Collections.sort(emps);
        System.out.println(emps);
       Collections.sort(emps, new Comparator<Emp>() {
           int x;
           @Override
           public int compare(Emp o1, Emp o2) {

               if( o1.hiredate.getTime()-o2.hiredate.getTime()>0) {
               x=-1;
               }
               if( o1.hiredate.getTime()-o2.hiredate.getTime()==0) {
                   x=0;
               }
               if( o1.hiredate.getTime()-o2.hiredate.getTime()<0) {
                   x=1;
               }

           return x;

           }
       });
       System.out.println(emps);
    }

}
