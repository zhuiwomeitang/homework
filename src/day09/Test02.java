package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
         Mythread a=new Mythread();
         Mythread2 b=new Mythread2();
         Thread thread=new Thread(a);
         Thread thread1=new Thread(b);
         thread.start();
         thread1.start();
    }
}
