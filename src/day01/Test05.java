package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String str="";
		char ch;
		for(int i=0;i<5;i++){
			int z=(int)(Math.random()*2);
			if(z==1){ch='a';}
			else{ch='A';}
			int a=(int)(Math.random()*26+ch);
            str=str+(char)a;

		}
	    System.out.println(str);
		System.out.println("请输入验证码");
        Scanner kb=new Scanner(System.in);
        String str1=kb.next();
        if(str1.equalsIgnoreCase(str)==true){
         System.out.println("验证成功");
        }else{System.out.println("验证失败");}
	}
	
}
