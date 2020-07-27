package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15 张三,25,男,5000,2006-02-15 李四,25,男,5000,2006-02-15 王五,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Collection<Emp> emps=new ArrayList<Emp>();
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();


        String regex1=",";int ci=0;
       while(ci<a){String sc=kb.next();
            String[]b=sc.split(regex1,5);
            SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
            Date date=sf.parse(b[4]);
            Emp emp=new Emp(b[0],Integer.parseInt(b[1]),b[2],Integer.parseInt(b[3]),date);
               if(emps.contains(emp)){
                   System.out.println("该对象已存在");break;
               }else{
                emps.add(emp);}
                ci++;
        }
       for(int i=0;i<emps.size();i++) {
           System.out.println(emps);
       }
    }
}
