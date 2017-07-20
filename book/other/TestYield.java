/**
 * Created by linsir on 2017/7/18.
 */
public class TestYield {
    public static void main(String[] args){
        MyThread3 t1 = new MyThread3("线程1");
        MyThread3 t2 =new MyThread3("线程2");
        t1.start();
        t2.start();
    }
}
