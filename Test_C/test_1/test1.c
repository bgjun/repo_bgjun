#include <stdio.h>


void printString();
void printInt(int);
void operatorTest();

int main(int argc, const char* argv[]) {
    printf("Hello World!\n");
    printString();
    operatorTest();
    return 0;
}

void printString() {
    printf("HelloWorld!\n");
    return;
}

void printInt(int x) {
    printf("integer = %d\n", x);
    return;
}

void operatorTest() {
    int x,y;
    x = 3;
    y = 13; 
    printInt(x);
    printInt(y);
    
    printf("x = %d\n", x);
    
    printf("++x = %d\n", ++x);
    printf("x++ = %d\n", x++);
    
    printf("x = %d\n", x);
    
    printf("--x = %d\n", --x);
    printf("x-- = %d\n", x--);
    
    printf("x = %d\n", x);

    printf("y = %d\n", y);

    printf("++y = %d\n", ++y);
    printf("y++ = %d\n", y++);
    
    printf("y = %d\n", y);

    printf("--y = %d\n", --y);
    printf("y-- = %d\n", y--);

    printf("y = %d\n", y);

    int i,j;
    i = x;
    i += y;
    j = x;
    j -= y;

    printf("x += y == %d\n", i);
    printf("x -= y == %d\n", j);

    return;
}


