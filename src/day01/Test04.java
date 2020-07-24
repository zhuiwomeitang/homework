package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
        int b=str.indexOf("@");
        String str1=str.substring(0,b);
        System.out.println(str1);
	}
}
