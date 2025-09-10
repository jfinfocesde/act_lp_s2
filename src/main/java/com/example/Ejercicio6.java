package com.example;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        // tu código aquí
        Scanner sc1 = new Scanner(System.in);
        System.out.println("dame el nombre de usuario");
        String nombre = sc1.nextLine();
        System.out.println("dame tu edad");
        int edad = sc1.nextInt();
        System.out.println("dame tu altura");
        double altura = sc1.nextDouble();
        System.out.println("Nombre guardado: " + nombre);
        System.out.println("Edad guardada: " + edad);
        System.out.println("Altura guardada: " + altura);
        sc1.close();
        
    }
}
