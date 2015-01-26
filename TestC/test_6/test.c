#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void PrintFullName(char *firstName, char *lastName);

int main(int argc, char *argv[]) {
    PrintFullName("David", "Mark");
    PrintFullName("James", "Bucanek");

    return 0;
}

void PrintFullName(char *firstName, char *lastName) {
    char fullName[ 20 ];
    strcpy( fullName, lastName );
    strcat( fullName, ", " );
    strcat( fullName, firstName );
    printf( "full name: %s\n", fullName );
}
   
