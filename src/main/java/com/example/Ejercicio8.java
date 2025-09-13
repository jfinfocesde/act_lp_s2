package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
      String miVariable = " Hola ";
      int _contador = 5;
      double $precio = 19.99;
      Boolean variable123 = true;
    // miVariable usa camelCase
    // _contador usa snake_case
    // $precio usa kebab-case  
    // variable123 usa PascalCase


    //EJEMPLOS DE IDENTIFICADORES INVÁLIDOS:
      // 1. 123xyz no puede comenzar con número
      // 2. mi-variable contiene guión medio (-)
      // 3. class es una palabra reservada de Java  
      // 4. public es una palabra reservada de Java
      // 5. mi variable contiene espacio
      // 6. variable@ contiene el símbolo @
      // 7. 2variable comienza con número
      // 8. while es una palabra reservada
      // 9. variable.nombre contiene punto
      //10. null es un literal especial de Java  

      System.out.println(miVariable);
      System.out.println(_contador);
    System.out.println($precio);
    System.out.println(variable123);
    }
}
