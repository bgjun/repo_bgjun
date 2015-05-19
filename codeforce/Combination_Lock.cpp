#include <iostream>
using namespace std;

int main() {
    unsigned int count;
    cin>>count;
    string first;
    cin>>first;
    string second;
    cin>>second;
    if (count < 1 || count > 1000) {
        return 0;
    }
    if (first.length() > count || second.length() > count) {
        return 0;
    }
    int firstValue;
    int secondValue;
    int countV;
    int totalCount = 0;
    for (int i = 0; i < (int)count; i++) {
        firstValue = (int)first[i] - 48;
        secondValue = (int)second[i] - 48;
        if (firstValue > secondValue) {
            countV = firstValue - secondValue;
            if (countV > 10 - countV) {
                countV = 10 - countV;
            }
        }
        else if (firstValue < secondValue) {
            countV = secondValue - firstValue;
            if (countV > 10 - countV) {
                countV = 10 - countV;
            }
        }
        else
            countV = 0;
        totalCount += countV;
    }
    cout<<totalCount<<endl;
    return 0;
}
