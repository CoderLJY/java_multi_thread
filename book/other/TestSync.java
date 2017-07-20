/**
 * Created by linsir on 2017/7/18.
 */
public class TestSync implements Runnable {
    Timer1 timer = new Timer1();
    public void run(){
        timer.add(Thread.currentThread().getName());
    }
    public static void main(String[] args){
            TestSync test = new TestSync();
            Thread t1 = new Thread(test);
            Thread t2 = new Thread(test);
            t1.setName("t1");
            t2.setName("t2");
            t1.start();
            t2.start();
    }
}
