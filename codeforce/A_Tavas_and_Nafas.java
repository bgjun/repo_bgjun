import java.util.Scanner;

//0   zero (nought)   10  ten      
//1   one 11  eleven       
//2   two 12  twelve (a dozen)    20  twenty (a score)
//3   three   13  thirteen    30  thirty
//4   four    14  fourteen    40  forty (no "u")
//5   five    15  fifteen (note "f", not "v") 50  fifty (note "f", not "v")
//6   six 16  sixteen 60  sixty
//7   seven   17  seventeen   70  seventy
//8   eight   18  eighteen (only one "t") 80  eighty (only one "t")
//9   nine    19  nineteen    90  ninety (note the "e")

public class A_Tavas_and_Nafas {
    public static void main(String[] args) {
        ProcessProblem pp = new ProcessProblem();
        pp.inputScore();
        pp.parseScoreToText();
        pp.printScore();
    }
}

class ProcessProblem {
    private int mScoreInt;
    private String mScoreString;
    
    public void inputScore() {
        Scanner sc = new Scanner(System.in);
        mScoreInt = sc.nextInt();
        sc.close();
    }
    public String getTens(int tens) {
        String str = null;
        switch (tens) {
        case 1:
            str = "ten";
            break;
        case 2:
            str = "twenty";
            break;
        case 3:
            str = "thirty";
            break;
        case 4:
            str = "forty";
            break;
        case 5:
            str = "fifty";
            break;
        case 6:
            str = "sixty";
            break;
        case 7:
            str = "seventy";
            break;
        case 8:
            str = "eighty";
            break;
        case 9:
            str = "ninety";
            break;
        }        
        return str;
    }
    
    private String getTeens(int ones) {
        String str = null;
        switch (ones) {
        case 1:
            str = "eleven";
            break;
        case 2:
            str = "twelve";
            break;
        case 3:
            str = "thirteen";
            break;
        case 4:
            str = "fourteen";
            break;
        case 5:
            str = "fifteen";
            break;
        case 6:
            str = "sixteen";
            break;
        case 7:
            str = "seventeen";
            break;
        case 8:
            str = "eighteen";
            break;
        case 9:
            str = "nineteen";
            break;
        }        
        return str;
    }

    private String getOnes(int ones) {
        String str = null;
        switch (ones) {
        case 0:
            str = "zero";
            break;
        case 1:
            str = "one";
            break;
        case 2:
            str = "two";
            break;
        case 3:
            str = "three";
            break;
        case 4:
            str = "four";
            break;
        case 5:
            str = "five";
            break;
        case 6:
            str = "six";
            break;
        case 7:
            str = "seven";
            break;
        case 8:
            str = "eight";
            break;
        case 9:
            str = "nine";
            break;
        }        
        return str;
    }
    public void parseScoreToText() {
        String str=null;
        int tens = mScoreInt / 10;
        int ones = mScoreInt % 10;
        if (mScoreInt == 0) {
            str = getOnes(ones);
        }
        if (tens == 0) {
            str = getOnes(ones);
        }
        else if (tens == 1 && ones == 0)
            str = getTens(tens);
        else if (tens == 1 && ones != 0) 
            str = getTeens(ones);
        else if (tens  >= 2) {
            str = getTens(tens);
            if (ones != 0) {
                str = str + "-" + getOnes(ones);
            }
        }
        mScoreString = str;
    }
    
    public void printScore() {
        System.out.println(mScoreString);
    }
}
