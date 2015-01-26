#include <stdio.h>

int main(int argc, char* argv[]) {

    int i;
    i = 1;
    while ( i < 3 ) {
        printf( "Looping: %d\n", i );
        i++;
    }
    printf( "We are past the while loop.\n" );


    for ( i = 1; i < 3; i++ )
        printf( "Looping: %d\n", i );
    printf( "We are past the for loop.\n" );

    int theYear = 1776;
    switch ( theYear ) {
        case 1066:
            printf( "Battle of Hastings\n" );
            break;
        case 1492:
            printf( "Columbus sailed the ocean blue\n" );
            break;
        case 1776:
            printf( "Declaration of Independence\n" );
            printf( "A very important document!!!\n" );
        break;
        default:
            printf( "Don’t know what happened during this year\n" );
    }

    return 0;
}
