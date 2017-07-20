package book.ch3.deadlock;
import book.ch3.problem.*;


public class Index6{
  public static void main(String[] args){
    Data data = new Data();
    Worker worker1 = new Worker(data);
    Worker worker2 = new Worker(data);
    Thread t1 = new Thread(worker1);
    Thread t2 = new Thread(worker2);
    t1.start();
    t2.start();
    while(true){
      data.isEqual();
      try {
        Thread.sleep(1000);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }

  }
}
