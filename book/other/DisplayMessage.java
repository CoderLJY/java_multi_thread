/**
 * Created by linsir on 2017/7/18.
 */
public class DisplayMessage implements Runnable{
    private String message;

    public DisplayMessage(String message){
        this.message = message;
    }
    public void run(){
        while (true){
            System.out.println(message);
        }
    }
}
