package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
     final double PRECIO_PRODUCTO = 15.99; 
    final int IVA_PORCENTAJE = 16; 
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Cantidad de productos: "); 
    int cantidadProductos = scanner.nextInt(); 
    scanner.nextLine(); // Limpiar el buffer 
    System.out.print("Nombre del cliente: "); 
    String nombreCliente = scanner.nextLine(); 
    double subtotal = PRECIO_PRODUCTO * cantidadProductos; 
    double iva = subtotal * IVA_PORCENTAJE / 100; 
    double total = subtotal + iva; 
    System.out.println("Factura para " + nombreCliente); 
    System.out.println("Cantidad de productos: " + cantidadProductos); 
    System.out.println("Subtotal: $" + subtotal); 
    System.out.println("IVA (" + IVA_PORCENTAJE + "%): $" + iva); 
    System.out.println("Total a pagar: $" + total); 
    scanner.close(); 

    }
    