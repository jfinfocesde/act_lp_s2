package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        // tu código aquí

         // 1) Declaración de cadenas
        String nombre = "Juan";
        String apellido = "Pérez";

        // 2) Concatenación con el operador +
        String nombreCompleto = nombre + " " + apellido;

        // 3) Concatenación con concat()
        String saludo = "Hola ".concat(nombreCompleto);

        // 4) Concatenar texto + número
        int edad = 20;
        String fraseEdad = "Tengo " + edad + " años";

        // 5) Imprimir resultados
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre completo (+): " + nombreCompleto);
        System.out.println("Saludo (concat): " + saludo);
        System.out.println(fraseEdad);
        
    }
}
