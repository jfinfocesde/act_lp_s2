package com.example;

import java.util.Scanner;

public class Ejercicio10 {
   public static void main(String[] args) {
        System.out.println("Ejercicio 10");
        // tu código aquí
        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos a comprar: ");
        String cantidadTexto = scanner.nextLine();
        int cantidad = Integer.parseInt(cantidadTexto);

        System.out.println("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        double subtotal = PRECIO_PRODUCTO * cantidad;
        double iva = subtotal * IVA_PORCENTAJE / 100.0;
        double total = subtotal + iva;

        System.out.println("----- FACTURA CLIENTE -----");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Cantidad de productos: " + cantidad);
        System.out.println("Precio unitario: $" + PRECIO_PRODUCTO);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (" + IVA_PORCENTAJE + "%): $" + iva);
        System.out.println("Total a pagar: $" + total);
        System.out.println("-------------------------");
    }
}
