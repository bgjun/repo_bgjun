#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(int argc, char* argv[]) {
    char lineBuffer[ 256 ];
    fgets( lineBuffer, sizeof(lineBuffer), stdin );
    int number = atoi( TrimLine(lineBuffer) );
    if ( number==0 && *TrimLine(lineBuffer)=='a' )
        return (-1);
    return 0;
}
