#include <stdio.h>

void DrawDots( int numDots );

int main(void) {
    int i;
    for ( i=1; i<=10; i++ ) {
        DrawDots( 30 );
        printf( "\n" );
    }
    return 0;
}

void DrawDots( int numDots )
{
    int i;
    for ( i = 1; i <= numDots; i++ )
        printf( "." );
}
