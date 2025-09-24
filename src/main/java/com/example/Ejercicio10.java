package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        
      import java.util.Scanner;

public class Facturacion {

    public static void main(String[] args) {
        
       
        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;

       
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Introduce el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        
        System.out.print("Introduce la cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();


        double subtotal = PRECIO_PRODUCTO * cantidadProductos;
        double iva = subtotal * IVA_PORCENTAJE / 100;
        double total = subtotal + iva;

       
        System.out.println("\n--- Factura ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (" + IVA_PORCENTAJE + "%): $" + iva);
        System.out.println("Total a pagar: $" + total);

  
        scanner.close();
    }
}

    }
}
