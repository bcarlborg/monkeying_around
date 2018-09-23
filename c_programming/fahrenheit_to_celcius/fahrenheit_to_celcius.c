#include <stdio.h>

#define FREEZING_POINT 32.0f
#define SCALING_FACTOR (5.0f / 9.0f)

int main(void) {
    float fahrenheit, celsius;

    printf("please enter the fahrenheit temp: ");
    scanf("%f", &fahrenheit);

    celsius = (fahrenheit - FREEZING_POINT) * SCALING_FACTOR;

    printf("your temperature in celsius is: %f\n", celsius);

    return 0;
}
