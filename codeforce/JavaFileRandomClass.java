import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class TestMain {
    public static void main(String[] args) {
        System.out.println("bgjun :: main hello");
        
        A a = new A();
        a.print();
        
        B b = new B();
        b.print();
        
        FileControl fc = new FileControl();
        fc.writeFile();
        fc.readFileA();
        fc.readFileB();
        fc.readFileC();
        
        RandomTest rt = new RandomTest();
        rt.getRandInt();
        rt.getRandIntLimit(10);
        rt.getRandAbsInt();
        rt.getRandAbsIntLimit(100);
        rt.getRandLong();
        rt.getRandAbsLong();
    }
}

class RandomTest {
    public int getRandInt() {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        int v = r.nextInt();
        System.out.println("bgjun :: getRandInt = " + v);
        return v;
    }
    
    public int getRandIntLimit(int limit){
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        int v = r.nextInt(limit);
        System.out.println("bgjun :: getRandIntLimit = " + v);
        return v;
    }

    public int getRandAbsInt() {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        int v = r.nextInt();
        System.out.println("bgjun :: getRandAbsInt = " + Math.abs(v));
        return Math.abs(v);
    }
    
    public int getRandAbsIntLimit(int limit){
        Random r = new Random(limit);
        r.setSeed(System.currentTimeMillis());
        int v = r.nextInt();
        System.out.println("bgjun :: getRandAbsIntLimit = " + Math.abs(v));
        return Math.abs(v);
    }
    
    public long getRandLong() {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        long v = r.nextLong();
        System.out.println("bgjun :: getRandLong = " + v);
        return v;
    }
    
    public long getRandAbsLong() {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        long v = r.nextLong();
        System.out.println("bgjun :: getRandAbsLong = " + Math.abs(v));
        return Math.abs(v);
    }

}

class FileControl {
    public void writeFile() {
        System.out.println("bgjun :: File out");
        try {
            FileOutputStream fos = new FileOutputStream("./test.txt");
            String str = "hello\nhello hello 123 6565 sda 6565as as65as5e a65asd5as,asdijas,qwe989as,akljskd";
            byte[] bb = new byte[str.length()];
            bb = str.getBytes();
            fos.write(bb);
            fos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void readFileA() {
        System.out.println("bgjun :: read A file in");
        try {
            BufferedReader br = new BufferedReader(new FileReader("./test.txt"));
            String str;
            str = br.readLine();
            System.out.println("bgjun :: read A str = " + str);
            str = br.readLine();
            System.out.println("bgjun :: read A str = " + str);
            br.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void readFileB() {
        System.out.println("bgjun :: read B file in");
        try {
            FileInputStream fis = new FileInputStream("./test.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            String str;
            str = new String(b);
            System.out.println("bgjun :: read B str = " + str);
            fis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    public void readFileC() {
        System.out.println("bgjun :: read C file in");
        try {
            FileInputStream fis = new FileInputStream("./test.txt");
            byte[] b = new byte[fis.available()];
            StringBuffer sb = new StringBuffer();
            int v;
            while (true) {
                v = fis.read();
                if (v == -1) {
                    System.out.println("read C str = " + sb.toString());
                    break;
                }
                if ((char)v == '\n' || (char)v == ' ' || (char)v == ','){
                    System.out.println("read C str = " + sb.toString());
                    sb.delete(0, sb.length());
                } else {
                    sb.append((char)v);
                }
            }
            fis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class A {
    private int A = 1;
    
    public void print(){
        System.out.println("bgjun :: A class hello ");
        System.out.println("bgjun :: A class getA = " + getA());
    }
    
    private int getA() {
        return A;
    }
}

class B {
    private int B = 2;
    
    public void print() {
        System.out.println("bgjun :: B class hello ");
        System.out.println("bgjun :: B class getB = " + getB());
    }
    
    private int getB() {
        return B;
    }
}
