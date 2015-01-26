#include <stdio.h>

int main(int argc, char* argv) {
    int x = 10;
    int* p;
    p = &x;
    printf(" p = %d\n", *p);

    int y = 3;
    int* py;

    py = &y;
    printf(" py = %d\n", *py);
    
    *py = 5;
    printf(" py = %d\n", *py);
    printf(" y = %d\n", y);

    py = &x;
    printf(" py = %d\n", *py);


    return 0;
}
