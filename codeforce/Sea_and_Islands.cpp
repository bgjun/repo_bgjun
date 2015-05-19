#include <iostream>
using namespace std;

class TestValue {
    private :
        int mN;
        int mK;
    public:
        TestValue(int n, int k);
        bool checkNValue();
        bool checkKValue();
        void getS();
};

int main() {
    int n;
    int k;
    cin>>n;
    cin>>k;
    TestValue* tv = new TestValue(n, k);
    if (!tv->checkNValue() || !tv->checkKValue()) {
        cout<<"NO"<<endl;
    }
    else {
        cout<<"YES"<<endl;
        tv->getS();
    }
    return 0;
}

TestValue::TestValue(int n, int k){
    mN = n;
    mK = k;
}

bool TestValue::checkNValue() {
    if (mN < 1 || mN > 100) {
        return false;
    }
    return true;
}

bool TestValue::checkKValue() {
    if (mK > (mN * mN + 1) / 2 || mK < 0) {
        return false;
    }
    return true;
}
void TestValue::getS() {
    int tempK = mK;
    int re = 0;
    bool change = false;
    for (int i = 0 ; i < mN; i++) {
        for(int j = 0; j <mN; j++) {
            if (tempK != 0 && j % 2 == re) {
                cout<<"L";
                tempK--;
            }
            else {
                cout<<"S";
            }
        }
        cout<<endl;
        if (re == 1)
            re = 0;
        else
            re = 1;
    }
}
