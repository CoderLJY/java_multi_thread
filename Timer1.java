/**
 * Created by linsir on 2017/7/18.
 */
public class Timer1 {
    private static int num = 0;
    public void add(String name){
        synchronized (this){
            num++;
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){}
            System.out.println(name + ", 你是第" + num + "个使用timer的线程");
        }
    }
}
