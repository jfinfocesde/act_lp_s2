package com.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {

        Scanner scanner = new Scanner(System.in);

        int cantidadDeProductos;
        String NombreDelCliente;
        
        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;

        System.out.println("Ingrese el nombre del cliente:");
        NombreDelCliente = scanner.nextLine();
        System.out.println("Ingrese la cantidad de productos:");
        cantidadDeProductos = scanner.nextInt();

        double subtotal = PRECIO_PRODUCTO * cantidadDeProductos;
        double iva = subtotal * IVA_PORCENTAJE / 100.0;
        double total = subtotal + iva;

        System.out.println("\n--- FACTURA ---");
        System.out.println("Cliente: " + NombreDelCliente);
        System.out.println("Cantidad de productos: " + cantidadDeProductos);
        System.out.println("Precio unitario: $" + PRECIO_PRODUCTO);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (" + IVA_PORCENTAJE + "%): $" + iva);
        System.out.println("Total a pagar: $" + total);
        System.out.println("---------------");
        

       scanner.close(); 
    }
}
