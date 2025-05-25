import java.util.Scanner;

public class NumerosParesImpares {

    /*EJERCICIO 3 Pág.32: Elaborar un programa que permita almacenar 12 números enteros en 
un vector llamado “números” y que posteriormente muestre la canti
dad de números pares e impares contenidos en el vector. */

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[12];

    System.out.println("Ingrese 12 números enteros:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Ingrese el número " + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();
    }

    int cantidadPares = 0;
    int cantidadImpares = 0;    
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] % 2 == 0) {
            cantidadPares++;
        } else {
            cantidadImpares++;
        }
    }
    System.out.println("Cantidad de números pares: " + cantidadPares);
    System.out.println("Cantidad de números impares: " + cantidadImpares);
    scanner.close();
}
}
