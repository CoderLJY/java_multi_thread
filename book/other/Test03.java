import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by linsir on 2017/7/18.
 */
public class Test03 {
    public static void main(String[] args){
        try {
            URL url = new URL("http://www.baidu.com");
            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine();
            while(data != null){
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
            isr.close();
            is.close();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
