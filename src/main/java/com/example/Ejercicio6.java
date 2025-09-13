package com.example;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();
        System.out.println("Ingrese su altura en metros:");
        double altura = sc.nextDouble();
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        sc.close();

    }
}
