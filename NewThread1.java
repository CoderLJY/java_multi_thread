/**
 * Created by linsir on 2017/7/18.
 */
public class NewThread1 implements Runnable{
    Thread t;
    NewThread1() {

        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread ： " + t);
        t.start();

    }
    public void run() {
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");

    }
}
