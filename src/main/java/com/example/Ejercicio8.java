package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        // tu código aquí

        // ---- Identificadores VÁLIDOS ----
        // Válido: empieza con letra, sin espacios ni símbolos prohibidos
        int miVariable = 10;

        // Válido: puede empezar con guion bajo _
        int _contador = 5;

        // Válido: puede empezar con $
        double $precio = 19.99;

        // Válido: puede contener números, pero NO puede empezar con número
        String variable123 = "ok";

        // ---- Identificadores INVÁLIDOS (SOLO COMENTADOS) ----
        // 123variable -> inválido: NO puede empezar con número
        // mi-variable -> inválido: NO se permiten guiones (usa camelCase o _)
        // class -> inválido: es una PALABRA RESERVADA de Java
        // public -> inválido: también es PALABRA RESERVADA

        // Imprimir variables válidas
        System.out.println("miVariable = " + miVariable);
        System.out.println("_contador = " + _contador);
        System.out.println("$precio = " + $precio);
        System.out.println("variable123 = " + variable123);

    }
}
