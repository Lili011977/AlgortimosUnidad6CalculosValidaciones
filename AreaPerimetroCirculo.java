/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmosunidad6calculosvalidaciones;

/**
 *
 * @author Lili
 */
public class AreaPerimetroCirculo {
    public static double calcularArea(double radio) {
    return Math.PI * radio * radio;
}

public static double calcularPerimetro(double radio) {
    return 2 * Math.PI * radio;
}

public static void main(String[] args) {
    java.util.Scanner entrada = new java.util.Scanner(System.in);

    System.out.println("AREA Y PERIMETRO DE UN CIRCULO");
    System.out.print("Ingresa el radio: ");
    double radio = entrada.nextDouble();

    if (radio > 0) {
        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimetro: %.2f%n", perimetro);
    } else {
        System.out.println("El radio debe ser mayor que cero.");
    }
}
}
