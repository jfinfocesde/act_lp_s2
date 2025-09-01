package com.example;
import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");

        Scanner scanner = new Scanner(System.in);

        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos a comprar: ");
        int cantidadDeProductos = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("nombre del cliente:");
        String nombreCliente = input.next();

        double subtotal = PRECIO_PRODUCTO * cantidadDeProductos;
        double iva = subtotal * IVA_PORCENTAJE / 100;
        double total = subtotal + iva;

        System.out.println("Factura de compra" + "Cliente: " + nombreCliente + "\n" + "Cantidad de productos: " + cantidadDeProductos + "\n" + "Precio producto: $" + PRECIO_PRODUCTO + "\n" + "Subtotal: $" + subtotal + "\n" + "IVA (16%): $" + iva + "\n" + "Total a pagar: $" + total);
      
    }

}