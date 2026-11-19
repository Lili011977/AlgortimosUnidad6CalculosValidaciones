/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmosunidad6calculosvalidaciones;

/**
 *
 * @author Lili
 */
public class Palindromo {
    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }

        return texto.equals(invertido);
    }

    public static void main(String[] args) {
        java.util.Scanner entrada =
                new java.util.Scanner(System.in);

        System.out.println("VERIFICAR PALINDROMO");
        System.out.print("Ingresa una palabra: ");

        String palabra = entrada.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }
    }
}

