import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//N일간 가격 N개의 숫자 1<=  <=10000
//총 K번 주식 구매 하루에 한번, 올라간날만
//케이스 개수 T 2<=  <= 100
// true -> 1 false = 0;
public class TestMain {
    static ArrayList<Integer> nSize = new ArrayList<Integer>();
    static ArrayList<Integer> k = new ArrayList<Integer>();
    static HashMap<Integer, ArrayList<Integer>> nValue = new HashMap<Integer, ArrayList<Integer>>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int T = 0;
        T = sc.nextInt();
        if (T < 1 || T > 100) {
            System.out.println("0");
            return;
        }
        int value;
        String str;
        
        for (int i = 0; i < T; i++) {
            nSize.add(sc.nextInt());
            k.add(sc.nextInt());
            ArrayList<Integer> temp = new ArrayList<Integer>();
            sc.nextLine();
            str = sc.nextLine();
            String[] strList = str.split(" ");
            for(int j = 0 ; j < strList.length; j++) {
                temp.add(Integer.parseInt(strList[j]));
            }
            nValue.put(i, temp);
        }
        for (int i = 0; i < T; i++){
            System.out.println("Case #" + i);
            if (isRight(i)) {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
    }
    
    private static boolean isRight(int count) {
        int size = nSize.get(count);
        int kValue = k.get(count);
        ArrayList<Integer> values = nValue.get(count);
        if (size != values.size()) {
            return false;
        }
        ArrayList<Integer> point = new ArrayList<Integer>();
        ArrayList<Integer> newPoint = new ArrayList<Integer>();
        int c = 1;
        int countValue = kValue;
        for (int a = 0 ; a < size ; a++) {
            if (a == 0) {
                for (int i = 0 ; i < values.size(); i++){
                    for (int j = i + 1; j < values.size(); j++) {
                        if (values.get(i) < values.get(j)) {
                            c++;
                        }
                        if (c >= countValue) {
                            newPoint.add(i);
                            break;
                        }
                    }
                    c = 1;
                }
                if (newPoint.size() < 1) {
                    return false;
                }
            }
            else {
                if (point.size() == 0) {
                    return false;
                }
                    
                for (Integer i: point){
                    for (int j = i + 1; j < values.size(); j++) {
                        if (values.get(i) < values.get(j)) {
                            c++;
                        }
                        if (c >= countValue) {
                            newPoint.add(i);
                            break;
                        }
                    }
                    c = 1;
                }
                if (newPoint.size() < 1) {
                    return false;
                }
            }
            point = (ArrayList<Integer>) newPoint.clone();
            newPoint.clear();
            countValue--;
            if (kValue - 1 == a) {
                break;
            }
        }
        return true;
    }
}
