package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95;
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        Scanner kb=new Scanner(System.in);
        String sc=kb.next();
        String regex=";" ;
        String[]a=sc.split(regex);
        String regex2=":";
        for(int i=0;i<a.length;i++){
         String[]b= a[i].split(regex2);
         map.put(b[0],b[1]);
        }
        System.out.println(map.get("物理"));
        map.replace("化学","96");
        map.remove("英语");
        //遍历key
        Set<String>set=map.keySet();
        for(String key:set){
         String value=map.get(key);
         System.out.println(key+value);
        }
        //遍历value
        Set<String>value=map.keySet();
        for(String k:value){
            String key=map.get(k);
            System.out.println(key);
        }
        //遍历entry
       Set<Map.Entry<String,String>>set1=map.entrySet();
        for(Map.Entry<String,String>en:set1){
          String key=en.getKey();
          String value1=en.getValue();
          System.out.println(key+value1);
        }
    }
}
