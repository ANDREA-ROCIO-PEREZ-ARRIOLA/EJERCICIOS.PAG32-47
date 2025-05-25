import java.util.Scanner;

public class NumerosEnteros {

    /*SEGUNDO EJERCICIO: Elaborar un programa que 
    permita almacenar 12 números enteros en un 
    vector llamado “números” y que posteriormente muestre el 
    promedio de los números ingresados. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];

        System.out.println("Ingrese 12 números enteros:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < 12; i++) {
            suma += numeros[i];
        }
        double promedio = (double) suma / 12;
        System.out.println("El promedio de los números ingresados es: " + promedio);
        scanner.close();

    }

}
