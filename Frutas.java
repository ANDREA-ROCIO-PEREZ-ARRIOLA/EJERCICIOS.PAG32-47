import java.util.Scanner;
import java.util.Arrays;
public class Frutas {

/*PRIMER EJERCICIO: Desarrollar un programa que permita almacenar 10 nombres de fru
tas en un vector llamando “frutas” y que posteriormente muestre el 
contenido del vector pero en forma inversa, es decir, el último ele
mento ingresado deberá aparecer primero y el primero en el último 
lugar. */

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] frutas = new String[10];

    System.out.println("Ingrese 10 nombres de frutas:");
    for (int i = 0; i < frutas.length; i++) {
        System.out.print("Fruta " + (i + 1) + ": ");
        frutas[i] = scanner.nextLine();
    }
    System.out.println("\nFrutas en orden inverso:");
    for (int i = frutas.length - 1; i >= 0; i--) {
        System.out.println(frutas[i]);
    }
    scanner.close();
}

}
