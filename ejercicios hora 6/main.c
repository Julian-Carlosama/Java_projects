

#include <stdio.h>
#include <stdlib.h>


main() {
    
    // declaracion de variables
    int x, y;
    
    // Inicializacion o asignacion
    x = 1;
    y = 3;
    
    printf("Dados los valores x = %d, y = %d \n", x, y);
    
    //Asigna el nuevo resultado de la adicion y a x
    x += y;
    printf(" x += y  asigna %d a x \n ", x);
    
    // Reestablece el valor de x
    x = 1;
    
    // Asigna el nuevo resultado de la operion a x
    x += -y;
    printf("x += -y asigna %d a x \n", x);
    
    // Reestablece el valor de x
    x = 1;
    
    // Asingna el nuevo resultado de la operacion de restar y a x
    x -= y;
    
    printf("x -= y asigna %d a x \n", x);
    
    // Reestablece el valor de x
    x = 1;
    
    // Por ley de signos se supone que esta operacion sera una suma de y a x
    x -= -y;
    
    printf("x -= -y asigna %d  a x \n", x);
    
    // Reestablece el valor de x
    x = 1;
    
    // Se hace una multiplicacion de x y el nuevo resultado se le asigna a x
    x *= y;
    
    printf("x *= y asigna %d a x \n", x);
    
    // Reestablece el valor de x
    x = 1;
    
    // Lo misma operacion que en la linea 49 pero con el resultado negativo
    x *= -y;
    
    printf("x *= -y asigna el valor de %d a x \n", x);
    

    return (0);
}

