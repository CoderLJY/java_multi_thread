/**
 * Created by linsir on 2017/7/18.
 */
public class MyThread3 extends Thread{
    public MyThread3(String s){
        super(s);
    }
    public void run(){
        for (int i = 1; i <= 20; i++){
            System.out.println(getName() + ": " + i);
            if (i%10 == 0){
                yield();
            }
        }
    }
}
