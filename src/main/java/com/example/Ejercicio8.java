package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        
        // Declaración de variables con identificadores válidos
        // Son válidos porque empiezan con una letra, un guion bajo (_) o un signo de dólar ($).
        // Pueden contener letras, números, guiones bajos o signos de dólar.
        int miVariable = 10;
        int _contador = 20;
        double $precio = 99.99;
        String variable123 = "Hola";

        // Ejemplos de identificadores inválidos (explicación en los comentarios)
        
        // int 123variable = 50; // Inválido: Un identificador no puede comenzar con un número.
        // int mi-variable = 60; // Inválido: Un identificador no puede contener un guion (-).
        // String class = "Clase"; // Inválido: 'class' es una palabra reservada de Java.
        // String public = "Publico"; // Inválido: 'public' es una palabra reservada de Java.

        // Impresión de las variables válidas
        System.out.println("El valor de miVariable es: " + miVariable);
        System.out.println("El valor de _contador es: " + _contador);
        System.out.println("El valor de $precio es: " + $precio);
        System.out.println("El valor de variable123 es: " + variable123);
        
    }
}

