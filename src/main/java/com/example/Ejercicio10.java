package com.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        // tu código aquí
        
          // Constantes
        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;

        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingresa tu nombre: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingresa la cantidad de productos: ");
        int cantidad = scanner.nextInt();

        // Calcular subtotal, iva y total
        double subtotal = PRECIO_PRODUCTO * cantidad;
        double iva = subtotal * IVA_PORCENTAJE / 100;
        double total = subtotal + iva;

        // Imprimir factura
        System.out.println("-------------------------------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + PRECIO_PRODUCTO);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA (" + IVA_PORCENTAJE + "%): " + iva);
        System.out.println("Total a pagar: " + total);
        System.out.println("-------------------------------");

        // Cerrar scanner
        scanner.close();

    }
}
