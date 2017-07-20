/**
 * Created by linsir on 2017/7/18.
 */
public class TestJoin {
    public static void main(String[] args){
        MyThread2 t1 = new MyThread2("线程1");
        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e){
        }
        for (int i = 1; i <= 10; i++){
            System.out.println("主线程");
        }

    }
}
