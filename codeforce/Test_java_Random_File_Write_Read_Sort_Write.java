import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Test_java_Random_File_Write_Read_Sort_Write {

    public static void main(String[] args) {
        System.out.println("bgjun :: hello");

        FileControl fc = new FileControl();
        
        fc.createFileForWrite("./origin.txt");
        
        RandomNumber rn = new RandomNumber();
        
        for (int i = 0; i < 1000000; i++) {
            fc.writeByteForWrite(rn.getRandom());
        }

        fc.closeFileForWrite();
        
        fc.createReaderForRead("./origin.txt");
        
        fc.readFileForRead();
        fc.printArray();
        fc.sortArray();
        fc.closeReaderForRead();
        
        fc.createFileForWrite("./new.txt");
        fc.writeArrayForWrite();
        fc.closeFileForWrite();
        
    }
}


class FileControl {
    private FileOutputStream mFos;
    private BufferedReader mBr;
    private String mValue;
    private ArrayList<Long> mArray;
    
    public void createReaderForRead(String path) {
        try {
            mBr = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void readFileForRead() {
        if (mBr != null) {
            try {
                String mValue;
                if (mArray != null) {
                    mArray.clear();
                    mArray = null;
                }
                mArray = new ArrayList<Long>();
                while (mBr != null) {
                    mValue = mBr.readLine();
                    if (mValue == null)
                        break;
                    else {
                        mArray.add(Long.valueOf(mValue));
                    }
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public void sortArray() {
        if (mArray != null) {
            Collections.sort(mArray);
//            for (int i = 0; i < mArray.size(); i++) {
//                System.out.println("mArray " + (i+1) + " = " + mArray.get(i));
//            }
        }
    }
    
    public void printArray() {
//        if (mArray != null) {
//            for (int i = 0; i < mArray.size(); i++) {
//                System.out.println("mArray " + (i+1) + " = " + mArray.get(i));
//            }
//        }
    }
    
    public void closeReaderForRead() {
        if (mBr != null){
            try {
                mBr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public void createFileForWrite(String path) {
        try {
            mFos = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }
        
    public void writeByteForWrite(long l) {
        if (mFos != null) {
            mValue = String.valueOf(l) + "\n";
            try {
                mFos.write(mValue.getBytes());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public void writeArrayForWrite() {
        if (mFos != null && mArray != null) {
            for (int i = 0; i < mArray.size(); i++) {
                mValue = String.valueOf(mArray.get(i)) + "\n";
                try {
                    mFos.write(mValue.getBytes());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        
    }
    
    public void closeFileForWrite() {
        if (mFos != null) {
            try {
                mFos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class RandomNumber {
    Random mR;
    public RandomNumber() {
        // TODO Auto-generated constructor stub
        mR = new Random();
        mR.setSeed(System.currentTimeMillis());
    }
    
    public long getRandom() {
        return Math.abs(mR.nextLong());
    }
}
