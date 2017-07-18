/**
 * Created by linsir on 2017/7/18.
 */
public class SynchronizedDemo {
    private boolean ready = false;
    private int result = 0;
    private int number = 1;

    public synchronized void write(){
        ready = true;
        number = 2;
    }
    public synchronized void read() {
        if(ready){
            result = number * 3;
        }
        System.out.println("result的值为： " + result);
    }
    private class ReadWriteThread extends Thread{
        private boolean flag;
        public ReadWriteThread(boolean flag){
            this.flag = flag;
        }
        public void run(){
            if(flag){
                write();
            }else{
                read();
            }
        }
    }
    public static void main(String[] args){
        SynchronizedDemo synDemo = new SynchronizedDemo();
        synDemo.new ReadWriteThread(true).start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        synDemo.new ReadWriteThread(false).start();
    }
}
