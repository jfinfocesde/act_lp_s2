package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        // tu código aquí
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        String saludo = "Hola ". concat(nombreCompleto);
        int edad = 25;
        String mensaje = saludo + ", tienes " + edad + " años";
        System.out.println(mensaje);
    }
}
