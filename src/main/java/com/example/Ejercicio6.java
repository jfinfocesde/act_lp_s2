package com.example;
import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine(); //  captura el nombre completo

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("ingrese su altura");
        double altura = scanner.nextDouble();

        System.out.println("Hola " + nombre );
        System.out.println("Tu edad es: " + edad + " años");
        System.out.println("Tu altura es: " + altura + " metros");

        /* scanner.close();  *///  no se puede cerrar el scanner por q luego no permite entrada en los otros ejercicios
        
        
    }
}
