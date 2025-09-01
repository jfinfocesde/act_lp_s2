package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
       byte numero = 100;
       short corta = 1000;
       int numero3 = 50000; 
       long numeroLargo = 1000000L;  // L al final para long para evitar errores    
       float conDecimales = 3.14f; // f al final para float       
       double doble = 2.71828;
       char letra = 'A';
       boolean esVerdadero = false;

        System.out.println("byte: " + numero);   
        System.out.println("short: " + corta);
        System.out.println("int: " + numero3);
        System.out.println("long: " + numeroLargo);
        System.out.println("float: " + conDecimales);
        System.out.println("double: " + doble);
        System.out.println("char: " + letra);
        System.out.println("boolean: " + esVerdadero);
    }
}