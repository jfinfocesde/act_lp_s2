package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
    int miVariable = 1;      // Válido: comienza con letra 
    int _contador = 2;       // Válido: comienza con '_' 
    double $precio = 3.99;   // Válido: comienza con '$' 
    int variable123 = 123;   // Válido: letras y números, no inicia por número 
    // int 123variable;      --> Inválido: inicia con número 
    // int mi-variable;      --> Inválido: contiene guion 
    // int class;            --> Inválido: palabra reservada 
    // int public;           --> Inválido: palabra reservada 
    System.out.println(miVariable); 
    System.out.println(_contador); 
    System.out.println($precio); 
    System.out.println(variable123);
    }
}
