package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        String regex1="\\+"; String regex11="\\d+(\\.\\d)?\\+\\d+(\\.\\d)?";
        String regex2="\\-";String  regex21="\\d+(\\.\\d)?\\-\\d+(\\.\\d)?";
        String regex3="\\*";String regex31="\\d+(\\.\\d)?\\*\\d+(\\.\\d)?";
        String regex4="\\/";String regex41="\\d+(\\.\\d)?\\/\\d+(\\.\\d)?";
        //String regex="(\\d+\\+\\d+)|(\\d+\\-\\d+)|(\\d+\\*\\d+)|(\\d+\\/\\d+)";
        String[]a;Float first,next;
        if(str.matches(regex11)){
            a=str.split(regex1,2);
            first=Float.parseFloat(a[0]);
            next=Float.parseFloat((a[1]));
            System.out.println(first+next);
        }
        if(str.matches(regex21)){
            a=str.split(regex2,2);
            first=Float.parseFloat(a[0]);
            next=Float.parseFloat((a[1]));
            System.out.println(first);
            System.out.println(next);
            System.out.println(first-next);
        }
        if(str.matches(regex31)){
            a=str.split(regex3,2);
            first=Float.parseFloat(a[0]);
            next=Float.parseFloat((a[1]));
            System.out.println(first*next);
        }
        if(str.matches(regex41)){
            a=str.split(regex4,2);
            first=Float.parseFloat(a[0]);
            next=Float.parseFloat((a[1]));
            System.out.println(first/next);
        }

    }
}
