import java.util.Scanner;

public class NumerosTranspuesta {

    /*EJERICIO 6 Pág.32: Desarrollar un programa que 
    permita almacenar 9 valores numéricos cualquiera 
    en una matriz y que posteriormente muestre su  
transpuesta. */

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] valores = new int[9];

    System.out.println("Ingrese 9 valores numéricos:");
    for (int i = 0; i < 9; i++) {
        System.out.print("Valor " + (i + 1) + ": ");
        valores[i] = scanner.nextInt();
    }
    System.out.println("\nTranspuesta de los valores:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(valores[i * 3 + j] + " ");
        }
        System.out.println();
    }
    scanner.close();

}

}
