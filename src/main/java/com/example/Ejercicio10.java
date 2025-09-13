package com.example;
import java.util.Scanner;
public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        // tu código aquí
        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;
        Scanner cs1 = new Scanner(System.in);
        System.out.println("ingrese la cantidad de productos");
        int cantidadProductos = cs1.nextInt();
        System.out.println("ingrese el nombre del cliente");
        String nombreCliente = cs1.next();
        int subTotal = cantidadProductos * (int) PRECIO_PRODUCTO;
        int iva = subTotal * IVA_PORCENTAJE / 100;
        int total = subTotal + iva;
        System.out.println("Hola " + nombreCliente + "! " + "Tu factura es: " + total + "pesos");
        cs1.close();



    }
}
