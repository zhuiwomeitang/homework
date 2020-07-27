package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
     Scanner kb=new Scanner(System.in);
           String str=kb.next();
           String regex=";";
           String regex1=",";
           String a[]=str.split(regex);
           Person[]p=new Person[a.length];
          for(int i=0;i<a.length;i++){
              String temp=a[i];
              String[]b= temp.split(regex1);
              p[i]=new Person(b[0],Integer.parseInt(b[1]),b[2],Integer.parseInt(b[3]));
          }
          for(int i=0;i<p.length;i++){
              System.out.println(p[i]);
          }
 }
}