package day09;
/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Runnable t=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("你好");
                }
            }
        };
        Runnable t1=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("再见");
                }
            }
        };
        Thread a=new Thread(t);
        Thread b=new Thread(t1);
        a.start();
        b.start();
    }
}
