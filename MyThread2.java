/**
 * Created by linsir on 2017/7/18.
 */
public class MyThread2 extends Thread {
    public MyThread2(String s){
        super(s);
    }
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.println("我是:" + getName());
            try{
                sleep(1000);
            }catch (InterruptedException e){
                return ;
            }
        }
    }
}
