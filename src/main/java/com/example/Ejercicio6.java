package com.example;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6() {

        //Variables
        String nombre;
        int edad;
        double altura; 

        //Entrada de datos
        Scanner scanner = new Scanner(System.in);

        //Solicitar nombre
        System.out.println("Escriba su nombre");
        nombre = scanner.nextLine();

        //Solicitar edad
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();

        //Solicitar altura 
        System.out.println("Ingrese su altura");
        altura = scanner.nextDouble();

        //Imprimir datos
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);

        //Cerrar Scanner
        scanner.close();
    }
}
