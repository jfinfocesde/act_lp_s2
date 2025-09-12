package com.example;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6(Scanner sc) {
        System.out.println("Ejercicio 6");
        // tu código aquí

        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa tu altura: ");
        double altura = scanner.nextDouble();

        // Mostrar datos capturados
        System.out.println("---------------------------");
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu altura es: " + altura);

    }
}
