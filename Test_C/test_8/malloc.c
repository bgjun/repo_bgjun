#include <stdio.h>
#include <stdlib.h>

struct DVDInfo {
    char *DVDName;
    char *DVDNumber;
    char *DVDDescription;
};


int main(void) {
    struct DVDInfo *myDVDPtr;
    myDVDPtr = malloc( sizeof( struct DVDInfo ) );

    myDVDPtr->DVDName = malloc(10 * sizeof(char));
    myDVDPtr->DVDNumber = malloc(10 * sizeof(char));
    myDVDPtr->DVDDescription = malloc(200 * sizeof(char));

    myDVDPtr->DVDName = "name1";
    myDVDPtr->DVDNumber = "number1";
    myDVDPtr->DVDDescription = "descriptiosdl;sdfk;lsdkf;'ldfgkdl;fkgn1";

    printf("myDVDPtr name = %s, number = %s, description = %s \n",
        myDVDPtr->DVDName, myDVDPtr->DVDNumber, myDVDPtr->DVDDescription);

    printf("myDVDPtr size = %zu\n", sizeof(myDVDPtr));

    struct DVDInfo *myDVDPtr2;

    myDVDPtr2 = (struct DVDInfo*)malloc(sizeof(struct DVDInfo));

    myDVDPtr2->DVDName = malloc(8 * sizeof(char));
    myDVDPtr2->DVDNumber = malloc(8 * sizeof(char));
    myDVDPtr2->DVDDescription = malloc(15 * sizeof(char));

    myDVDPtr2->DVDName = "name2";
    myDVDPtr2->DVDNumber = "number2";
    myDVDPtr2->DVDDescription = "description2";

    printf("myDVDPtr2 name = %s, number = %s, description = %s \n",
        myDVDPtr2->DVDName, myDVDPtr2->DVDNumber, myDVDPtr2->DVDDescription);
    
    printf("myDVDPtr2 size = %zu\n", sizeof(myDVDPtr2));

    free(myDVDPtr);
    free(myDVDPtr2);

    return 0;
}
