/**
 * Created by linsir on 2017/7/18.
 */
public class NewThread2 extends Thread {
    NewThread2(){

        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start();
    }
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
