#include <stdio.h>
#include <stdbool.h>
#include <math.h>


bool Factor( int number, int *firstFactorPtr, int *secondFactorPtr);

int main(void) {
    int n;
    int factor1, factor2;
    bool isPrime;
    
    n = 15;
    isPrime = Factor(n, &factor1, &factor2);
    if (isPrime)
        printf("the number %d is prime\n", n);
    else
        printf("the number %d has %d and %d as factors \n", n, factor1, factor2);
}

bool Factor( int number, int *firstFactorPtr, int *secondFactorPtr) {
    int factor;
    for ( factor = sqrt(number); factor > 1; factor-- ) {
        if ( (number % factor) == 0 ) {
            break;
        }
    }
    *firstFactorPtr = factor;
    *secondFactorPtr = number;
    return ( factor == 1);
}
