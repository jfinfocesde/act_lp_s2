package com.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {

        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;

        Scanner scanner = new Scanner(System.in);

        // Ingresar cantidad de productos
        int cantidadDeProductos;
        System.out.println("Ingrese la cantidad de productos");
        cantidadDeProductos = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer


        // Ingresar nombre
        String nombreDelCliente;
        System.out.println("Ingrese su nombre");
        nombreDelCliente = scanner.nextLine();

        // Calcular Subtotal
        double subtotal = cantidadDeProductos * PRECIO_PRODUCTO;
        System.out.println("El subtotal es: " + subtotal);

        // Calcular IVA
        double iva = (subtotal * IVA_PORCENTAJE) / 100;
        System.out.println("El IVA es: " + iva);

        // Calcula total
        double total = subtotal + iva;
        System.out.println("Hola " + nombreDelCliente + ", su total es " + total);

        scanner.close();
    }
}
