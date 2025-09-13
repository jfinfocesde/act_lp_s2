package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        String nombre = "juan";
        String apellido = "perez";
        String nombreCompleto = nombre + " " + apellido;
        String saludo = "hola ".concat(nombreCompleto);
        int edad = 20;
        System.out.println("Tengo " + edad + " años");
       
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombreCompleto);
        System.out.println(saludo);
        
    }
}
