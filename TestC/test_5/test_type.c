#include <stdio.h>
#include <math.h>

int main(int argc, const char* argv[]) {
    int myInt = 323232;
    float myFloat = 232422.343f;
    double myDouble = 23245.343535;
    long double myLongDouble = 342324344.2342342342343L;
    
    unsigned int neverNegNum;
    neverNegNum = -2;
    int anyNum;
    anyNum = neverNegNum;

    printf("neverNegNum = %d, anyNum = %d\n\n", neverNegNum, anyNum);


    printf( "sizeof( int ) = %zu\n", sizeof( int ) );
    printf( "sizeof( float ) = %zu\n", sizeof( float ) );
    printf( "sizeof( double ) = %zu\n", sizeof( double ) );
    printf( "sizeof( long double ) = %zu\n\n", sizeof( long double ) );

    printf("myInt = %d\n", myInt);
    printf("myFlout = %f\n", myFloat);
    printf("myDouble = %f\n", myDouble);
    printf("myLongDouble = %Lf\n\n", myLongDouble);


    printf("myInt = %4d\n", myInt);
    printf("myFlout = %8.1f\n", myFloat);
    printf("myDouble = %16.2f\n", myDouble);
    printf("myLongDouble = %24.4Lf\n\n", myLongDouble);

    printf( "myFloat = %10.1f\n",myFloat );
    printf( "myFloat = %.2f\n", myFloat );
    printf( "myFloat = %.12f\n", myFloat );
    printf( "myFloat = %.9f\n\n", myFloat );

    printf( "sizeof( char ) = %zu\n", sizeof( char ) );
    printf( "sizeof( unsigned char ) = %zu\n", sizeof( unsigned char ) );
    printf( "sizeof( short int ) = %zu\n", sizeof( short int ) );
    printf( "sizeof( int ) = %zu\n\n", sizeof( int ) );

    int i = 0;
/*
    for (i = 0; i < 128; i++) {
        printf("%c ",i);
        if (i % 10 == 0) {
            printf("\n");
        }
    }
*/

    printf("\n");

    int r = srand(clock()) % 10 + 1;
    printf("rand = %d\n", r);
    return 0;
}
