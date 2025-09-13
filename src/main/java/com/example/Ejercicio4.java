package com.example;

public class Ejercicio4 {
    public static void ejercicio4() {

        //Variables
        final double PI = 3.14159;
        final int DIAS_SEMANA = 7;
        final String NOMBRE_UNIVERSIDAD = "CESDE";
        double radio = 5.0;
        double area = PI * Math.pow(radio, 2);
        
        //Imprimir variables
        System.out.println(PI);
        System.out.println(DIAS_SEMANA);
        System.out.println(NOMBRE_UNIVERSIDAD);
        System.out.println("El área del círculo con radio es " + radio + " es: " + area);
    }
}
