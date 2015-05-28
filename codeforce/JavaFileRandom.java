import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class JavaFIleRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        try {
            FileOutputStream os = new FileOutputStream("test.txt");
            String str;
            
            for (int i = 0; i < 100000; i++) {
                long l = rand.nextLong();
                l = Math.abs(l);
                str = String.valueOf(l);
                str += str + "\n";
                byte[] b = new byte[str.length()];
                b = str.getBytes();
                os.write(b);
            }
            os.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String str;
            while(br != null && (str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return;
    }
}
