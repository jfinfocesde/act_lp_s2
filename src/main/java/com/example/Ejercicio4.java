package com.example;
public class Ejercicio4 {
    public static void ejercicio4() {
        
        final double PI = 3.14159;
        final int DIAS_SEMANA = 7;
        final String NOMBRE_UNIVERSIDAD = "CESDE";
        
        int radio = 5;
        double areaCirculo = PI * radio * radio;

        System.out.println("Constante PI: " + PI);
        System.out.println("Constante DIAS_SEMANA: " + DIAS_SEMANA);
        System.out.println("Constante NOMBRE_UNIVERSIDAD: " + NOMBRE_UNIVERSIDAD);
        
        System.out.println("El area del circulo con radio " + radio + " es: " + areaCirculo);
    }
}
