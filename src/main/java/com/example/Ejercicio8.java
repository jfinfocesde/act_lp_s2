package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        // tu código aquí
        String miVariable = "variable";
        // 'miVariable' es válido porque usa letras y sigue la convención camelCase.
        System.out.println("esto es una " + miVariable);

        int _contador = 123;
        // '_contador' es válido porque los identificadores pueden empezar con un guion bajo.
        System.out.println("esto es un " + _contador);

        double $precio = 1.5;
        // '$precio' es válido porque los identificadores pueden empezar con el signo de dólar.
        System.out.println("esto es un " + $precio);

        boolean variable123 = true;
        // 'variable123' es válido porque puede contener números, siempre que no sea al inicio.
        System.out.println("esto es una " + variable123);
        
        // Nombres inválidos:
        // '123variable': No es válido porque no puede empezar con un número.
        // 'mi-variable': No es válido porque el guion '-' no es un carácter permitido.
        // 'class' y 'public': No son válidos porque son palabras clave reservadas de Java.
        
    }
}