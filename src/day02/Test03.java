package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        String regex="\\.";
        String[]a=str.split(regex,4);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
