package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");

        // Declaración de constantes
        final double precioProducto = 15.99;
        final int ivaPorcentaje = 16;

        // Crear Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Captura de datos del usuario
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();

        // Cálculos
        double subtotal = precioProducto * cantidadProductos;
        double iva = subtotal * ivaPorcentaje / 100;
        double total = subtotal + iva;

        // Impresión de la factura
        System.out.println("\n========== FACTURA ==========");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Precio por producto: $" + precioProducto);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (" + ivaPorcentaje + "%): $" + iva);
        System.out.println("Total a pagar: $" + total);
        System.out.println("==============================");

        //Constantes: Se definen con final.

//Entrada de datos: Se usa Scanner para leer String y int.

//Cálculos: Subtotal, IVA y total.

//Salida: La factura se imprime usando concatenación.

//Estilo: Todas las variables usan lowerCamelCase.
    
        // Cierre del Scanner
        scanner.close();
    }
}

