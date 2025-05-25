import java.util.Scanner;

public class PuntodeSilla {

    /*EJERCICIO 7 pág.32: Desarrollar un programa que permita almacenar 12 valores numé
ricos cualquiera en una matriz y como resultado deberá mostrar si 
existe algún “punto de silla” y el número donde se presenta. */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        boolean puntoSilla = false;

        // Llenar la matriz con valores ingresados por el usuario
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Buscar el punto de silla
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                boolean esPuntoSilla = true;
                // Verificar si es el máximo en su fila
                for (int k = 0; k < 4; k++) {
                    if (matriz[i][k] > matriz[i][j]) {
                        esPuntoSilla = false;
                        break;
                    }
                }
                // Verificar si es el mínimo en su columna
                if (esPuntoSilla) {
                    for (int k = 0; k < 3; k++) {
                        if (matriz[k][j] < matriz[i][j]) {
                            esPuntoSilla = false;
                            break;
                        }
                    }
                }
                // Si se encuentra un punto de silla, mostrarlo
                if (esPuntoSilla) {
                    System.out.println("Se encontró un punto de silla en la posición [" + i + "][" + j + "] con valor: " + matriz[i][j]);
                    puntoSilla = true;
                }
            }
        }

        if (!puntoSilla) {
            System.out.println("No se encontró ningún punto de silla.");
        }

        sc.close();
    }
}


