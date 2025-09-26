package com.example;
import java.util.Scanner;
public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        System.out.println("INGRESE SU NOMBRE");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();

        System.out.println("INGRESE EDAD ");
        int edad = scanner.nextInt();
        
        System.out.println("INGRESE ESTATURA ");
        double estatura = scanner.nextDouble();

        System.out.println("SU NOMBRE ES " + nombre + " SU EDAD ES " + edad + " SU ESTATURA ES " + estatura);
        scanner.close();
                           
        
    }
}
