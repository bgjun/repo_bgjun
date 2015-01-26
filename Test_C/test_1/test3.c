#include <stdio.h>

int main(int argc, char* argv) {
    int v = 3;
    int i = 0;
    for(i = 0; i < 10; i++) {
        printf("i == %d\n", i); 
        if (i == v)
            continue;
        printf("OK\n");
    }
    return 0;
}
