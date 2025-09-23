package com.example;
import java.util.Scanner;
public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
<<<<<<< HEAD
        // tu código aqui
=======
        // tu código aquí
>>>>>>> aa69d942fad4d8bbc9ad63ce8abf2e869ddce3e9
        System.out.println("Ingrese su nombre ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        System.out.println("Ingrese su estatura");
        double estatura = scanner.nextDouble();
        System.out.println("tu nombre es " + nombre + ", tienes " + edad + " años y mides " + estatura + " metros");
        scanner.close();
    }
}
