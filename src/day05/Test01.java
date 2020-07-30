package day05;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<Integer>col=new ArrayList<>();
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);
        col.add(5);
        for(Integer s:col) {
            System.out.println(s);
        }
    }

}
