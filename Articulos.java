import java.util.Scanner;

public class Articulos {

    /*EJERCICIO 5 Pág.32: Desarrollar un programa que permita almacenar 9 nombres de artí
culos en una matriz llamada “artículos”,  posteriormente deberá mos
trar el contenido de matriz en el orden de las filas invertido, es decir, 
la última fila debe aparecer primero y la primera de último. */

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String [] articulos = new String[9];

    System.out.println("Ingrese 9 nombres de artículos:");
    for (int i = 0; i < articulos.length; i++) {
        System.out.print("Artículo " + (i + 1) + ": ");
        articulos[i] = scanner.nextLine();
    }

    System.out.println("\nArtículos en orden invertido:");
    for (int i = articulos.length - 1; i >= 0; i--) {
        System.out.println(articulos[i]);
    }
    scanner.close();
}
}
