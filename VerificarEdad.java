/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmosunidad6calculosvalidaciones;

/**
 *
 * @author Lili
 */
public class VerificarEdad {
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {
        java.util.Scanner entrada =
                new java.util.Scanner(System.in);

        System.out.println("VERIFICAR EDAD");
        System.out.print("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        if (puedeVotar(edad)) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar.");
        }
    }
}

