package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer>col=new ArrayList<Integer>();
        col.add(0);
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);
        col.add(5);
        col.add(6);
        col.add(7);
        col.add(8);
        col.add(9);
        col.subList(3,7).replaceAll(t->t*10);
       //col1.replaceAll(t->t*10);
       System.out.println(col);
       List<Integer>col1=col.subList(7,10);
       col.removeAll(col1);
       System.out.println(col);

    }
}
