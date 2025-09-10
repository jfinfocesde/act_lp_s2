package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        // tu código aquí
        String miVariable = "Hola"; //miVariable es un nombre correcto porque usa camelCase
        String _contador = "cómo"; //_contador es un nombre correcto porque inicia con guión bajo
        String $precio = "estas"; //$precio es un nombre correcto porque inicia con signo de dólar
        String variable123 = "tú"; //valiable123 es un nombre correcto porque no inicia con los números, si fuera 123variable, no se permitiría
        //nombres como mi-variable está incorrecto porque este es kebab-case u se está usando camelCase
        //nombres como class o public no se permiten porque son palabras reservadas de el lenguaje de Java :D
        System.out.println(miVariable);
        System.out.println(_contador);
        System.out.println($precio);
        System.out.println(variable123);
    }
}
