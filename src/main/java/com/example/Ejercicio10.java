package com.example;

import java.util.Scanner;

public class Ejercicio10 {
     public static void ejercicio10() {
        System.out.println("Ejercicio 10"); 
   Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos: ");
         System.out.println("Ejercicio 10");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su nombre:");
        String nombreCliente = sc.nextLine();
        sc.close();
        double PRECIO_PRODUCTO = 15.99;
        int IVA_PORCENTAJE = 16;
        double subtotal = PRECIO_PRODUCTO * cantidad;
        double iva = subtotal * IVA_PORCENTAJE / 100;
        double total = subtotal + iva;
        System.out.println("Factura para: " + nombreCliente);
        System.out.println("Cantidad de productos: " + cantidad);   
        System.out.printf("Precio unitario: $%.2f%n", PRECIO_PRODUCTO);
        System.out.printf("Subtotal: $%.2f%n", subtotal);   
        System.out.printf("IVA (16%): $%.2f%n", iva);
        System.out.printf("Total a pagar: $%.2f%n", total);
    scanner.close(); 

    }
}
