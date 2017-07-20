import java.util.Date;

/**
 * Created by linsir on 2017/7/18.
 */
public class MyThread extends Thread{
    boolean flag = true;

    public void run() {
        while(flag){
            System.out.println("===" + new Date() + "===");
            try{
                sleep(1000);
            }catch (InterruptedException e){
                return;
            }
        }
    }
}
