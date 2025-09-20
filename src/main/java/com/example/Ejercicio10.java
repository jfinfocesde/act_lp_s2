package com.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        double subtotal = PRECIO_PRODUCTO * cantidadProductos;
        double iva = subtotal * IVA_PORCENTAJE / 100;
        double total = subtotal + iva;
        System.out.println("\n--- FACTURA ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Precio unitario: $" + PRECIO_PRODUCTO);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (" + IVA_PORCENTAJE + "%): $" + iva);
        System.out.println("TOTAL A PAGAR: $" + total);
        scanner.close();
        
    
    }
}
