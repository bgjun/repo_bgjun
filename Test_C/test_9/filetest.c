#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
    FILE *fp;
    if ( (fp = fopen( "./MyDataFile.txt", "r")) == NULL ) {
        printf( "Can not open file!!!\n" );
        exit(1);
    }


    int c;
    while ( (c = fgetc( fp )) != EOF ) {
        putchar( c );
    }

    if (fp != NULL) {
        printf("fp is not null\n");
        fclose(fp);
        fp = NULL;
    }
    return 0;
}
