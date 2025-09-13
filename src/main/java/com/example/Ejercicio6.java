package com.example;

public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
     Scanner scanner = new Scanner(System.in); 
    System.out.print("Introduce tu nombre: "); 
    String nombre = scanner.nextLine(); 
    System.out.print("Introduce tu edad: "); 
    int edad = scanner.nextInt(); 
    System.out.print("Introduce tu altura: "); 
    double altura = scanner.nextDouble(); 
    System.out.println("Nombre: " + nombre); 
    System.out.println("Edad: " + edad); 
    System.out.println("Altura: " + altura); 
    scanner.close();
    }
}
