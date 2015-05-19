#include <iostream>

using namespace std;

class MagicNumber {
    public :
        const int getLuckyNumberCount(long long inputNumber);

    private:
        int getDigit(long long input);
        long long getPitchValue(int pitchIndex);
        long long getMin(int j, int i);
        long long getMax(int j, int i);
        long long getPow(int j);
};


int main() {
    long long value;

    cin>>value;

    MagicNumber m;
    int v = m.getLuckyNumberCount(value);
    cout<<v<<endl;
    return 0;
}

const int MagicNumber::getLuckyNumberCount(long long inputNumber) {
    int luckyNumberCount = 0;
    if (inputNumber > (long long)1000000000 || inputNumber < 4) {
        return 0;
    }
    long long clone;
    int value;
    int digit = getDigit(inputNumber);
    long long min;
    long long max;
    for (int j = 0; j < digit; j++) {

        for (int i = 4; i <= 7;) {
            min = getMin(j, i);
            max = getMax(j, i);
            long long pitch = 0;
            int pitchIndex = 1;

            for (long long k = min; k <= max;) {
                clone = k ;
                if (clone > inputNumber)
                    break;
                do {
                    value = (int)((clone % 10));
                    if (value != 4 && value != 7) {
                        break;
                    }
                    else {
                        clone = clone / 10;
                        if (clone == 0 || clone == 4 || clone == 7) {
                            luckyNumberCount++;
                            break;
                        }
                    }
                }while(true);
                k = k - pitch;
                pitch = getPitchValue(pitchIndex);
                pitchIndex++;
                k = k + pitch;
            }

            if (i == 4) {
                i = 7;
            } else {
                break;
            }
        }
    }
    return luckyNumberCount;
}

int MagicNumber::getDigit(long long input) {
    int count = 1;
    do {
        input /= 10;
        if (input == 0) break;
        count++;
    }while(true);
    return count;
}

long long MagicNumber::getPitchValue(int pitchIndex) {
    long long v = 0;
    int i = pitchIndex;
    int count = 0;
    do {
        int moc = i / 2;
        int re = i % 2;
        if (re != 0) {
            v += (long long)((long long)3 * getPow(count));
        }
        if (moc == 0) {
            break;
        } else {
            i = moc;
        }
        count++;
    }while(true);
    return v;
}

long long MagicNumber::getMin(int j, int i) {
    long long v = 0;
    if (j == 0) {
        return i;
    }
    for (int x = 0; x <= j - 1; x++) {
        v += getPow(x) * (long long)4L;
    }
    v += getPow(j) * (long long)i;
    return v;
}

long long MagicNumber::getMax(int j, int i) {
    long long v = 0;
    if (j == 0) {
        return i;
    }
    for (int x = 0; x <= j - 1; x++) {
        v += getPow(x) * (long long)7L;
    }
    v += getPow(j) * (long long)i;
    return v;
}

long long MagicNumber::getPow(int j) {
    long long v = 1;
    long long v2 = 1;
    if (j > 1) {
        v = v * 10;
        j--;
        v2 = getPow(j);
    }
    else if (j == 1) {
        v = 10;
    }
    return v * v2;
}
