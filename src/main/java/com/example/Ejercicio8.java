package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        String miVariable = "juan"; // usa el forma camelCase
        int _contador = 0; // está permitido pero no es recomendable usar el guion bajo al inicio
        int $precio = 100; // aunque no es recomendable usar el signo de dólar pero se puede usar
        String variable123 = "esto es una variable"; // se puede usar números pero no al inicio

        // String 123variable = "esto no es válido"; // no se puede usar números al inicio
        // String mi-variable = "esto no es válido"; // no se puede usar guion medio
        // String class = "esto no es válido"; // no se pueden usar palabras reservadas
        // String public = "esto no es válido"; // no se pueden usar palabras reservadas

        System.out.println(miVariable);
        System.out.println(_contador);
        System.out.println($precio);
        System.out.println(variable123);
    }
}
