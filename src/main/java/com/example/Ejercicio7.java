package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {

        //Variables
        String nombre = "Juan";
        String apellido = "Perez"; 
        String nombreCompleto = nombre + " " + apellido; 
        String saludo = "Hola ".concat(nombreCompleto);
        int edad = 20;
        String mensajeEdad = "Tengo " + edad + " años."; 

        //Imprimir mensajes
        System.out.println(saludo);
        System.out.println(mensajeEdad);
    }
}
