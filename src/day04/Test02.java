package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> col=new ArrayList<String>();
        col.add("1");
        col.add("$");
        col.add("2");
        col.add("$");
        col.add("3");
        col.add("$");
        col.add("4");
        Iterator<String>it=col.iterator();
        String str=it.next();
        while (it.hasNext()){
            if(str.equals("$")){it.remove();}
            str=it.next();
        }
       System.out.println(col);
       for(int i=0;i<col.size();i++){
           System.out.println(col.get(i));
       }
    }
}
