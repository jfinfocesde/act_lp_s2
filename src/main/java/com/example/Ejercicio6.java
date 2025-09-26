package com.example;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6() {

        Scanner scanner = new Scanner(System.in);

        String nombreUsuario;
        int edad;
        double altura;

        System.out.println("Ingrese su nombre:");
        nombreUsuario = scanner.nextLine();

        System.out.println("Ingrese su edad:");
        edad = scanner.nextInt();

        System.out.println("Ingrese su estatura:");
        altura = scanner.nextDouble();
        
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + altura + " centimetros");

        
    }
}