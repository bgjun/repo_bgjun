#include <stdio.h>
#include <string.h>

int main(void) {
    char name[20];

    printf("input == ");
//    scanf("%19s", name);
    scanf("%19[^\n]", name);

    printf("input value = %s\n", name);
    printf("input strlen = %zu\n", strlen(name));

    return 0;
}
