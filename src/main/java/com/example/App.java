package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa una coordenada (ejemplo: a1): ");
    String entrada = scanner.nextLine();
    
    if (entrada.length() != 2) {
        System.out.println("Entrada inválida. Debe tener exactamente 2 caracteres.");
        scanner.close();
        return;
    }

    char letra = entrada.charAt(0);
    char numChar = entrada.charAt(1);

    int col = letra - 'a' + 1;
    int fila = 8 -(numChar -'0') + 1; 
    
    if (col < 1 || col > 8 || fila < 1 || fila > 8) {
        System.out.println("Entrada inválida. La letra debe estar entre 'a' y 'h' y el número entre '1' y '8'.");
        scanner.close();
        return;
    }
    
    System.out.println(col + " " + fila);

    scanner.close();

    }
}
