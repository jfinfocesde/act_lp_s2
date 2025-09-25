package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        String saludo = "Hola, ".concat(nombreCompleto);
        int edad = 25;
        String mensajeEdad = "Tienes ".concat(String.valueOf(edad)).concat(" años");
        System.out.println(saludo);
        System.out.println(mensajeEdad);
    }
}
