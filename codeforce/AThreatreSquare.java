import java.util.Scanner;

public class AThreatreSquare {
    public static void main(String[] args) {
        ProcessProblem pp = new ProcessProblem();
        pp.input();
        pp.print();
    }
}

class ProcessProblem {
    private long n;
    private long m;
    private long a;
    public void input() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        m = sc.nextLong();
        a = sc.nextLong();
        sc.close();
    }
    public void print() {
        long row = n/a;
        long row_re = n % a == 0 ? 0 : 1;
        long col = m/a;
        long col_re = m % a == 0 ? 0 : 1;
        System.out.println((row+row_re)*(col +col_re));

    }
}
