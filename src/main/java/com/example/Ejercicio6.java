package com.example;

public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
         package com.example;

        Scanner scanner = new Scanner(System.in);

         System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

         System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

         System.out.print("Ingrese su altura:");
        double altura = scanner.nextDouble();


        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " m");


    }
}
