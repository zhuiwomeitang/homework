package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
      String regex="\\d{3}-{1}\\d{8}|\\d{4}-{1}\\d{7}";
      Scanner kb=new Scanner(System.in);
      String str=kb.next();
      System.out.println(str.matches(regex));
    }
}
