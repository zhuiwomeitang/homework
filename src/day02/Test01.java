package day02;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        String regex="^(\\-|\\+)?\\d*";
        String regex1="^(\\-|\\+)?\\d+(\\.\\d+)+ *";
        boolean flag= str.matches(regex);
        //System.out.println(flag);
        boolean flag1= str.matches(regex1);
        //System.out.println(flag1);
        if(flag==true){
            Integer a = Integer.parseInt(str);
           System.out.println(a*10);
        }
        else if(flag1==true){
            Double b=Double.parseDouble(str);
            System.out.println(b*5);
        }else {System.out.println("不是数字");}

    }
}
