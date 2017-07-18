/**
 * Created by linsir on 2017/7/18.
 */
public class TestInterrupt {
    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.start();
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){}
        thread.interrupt();
    }
}
