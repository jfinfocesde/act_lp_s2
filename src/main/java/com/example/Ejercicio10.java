package com.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");

        final double precioProducto = 15.99;
        final int ivaPorcentaje = 16;

        Scanner sc = new Scanner(System.in);
        
 System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        
      System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = sc.nextInt()

        double subtotal = precioProducto * cantidadProductos;
        double iva = subtotal * ivaPorcentaje / 100;
        double total = subtotal + iva;

        System.out.println("------ FACTURA ------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Precio unitario: $" + precioProducto);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (" + ivaPorcentaje + "%): $" + iva);
        System.out.println("TOTAL: $" + total);
        System.out.println("---------------------");

        sc.close();
    }
}
