package EjercicioPag40;

import java.util.Scanner;

public class JuegoAnimales {
/* 2. Modificar el programa del juego agregando el nivel 2, deben aparecer cuatro preguntas, cada una con un 
puntaje de 20 si es correcta y de -10 si es incorrecta. Al finalizar el juego, el programa debe mostrar el pun
taje acumulado de los dos niveles.*/


    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner scanneranimal;

    public JuegoAnimales() {
        puntaje = 0;
        scanneranimal = new Scanner(System.in);
        animales = new String[2];
        animales[0] = "gato";
        animales[1] = "pajaro";
    }

    private void puntajePerro() {
        if (respuesta.equalsIgnoreCase(animales[0])) {
            System.out.println("EXCELENTE! Has ganado 10 puntos");
            puntaje += 10;
        } else {
            System.out.println("FALLASTE! La respuesta correcta es: " + animales[0]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5;
        }
    }

    private void puntajeGato() {
        if (respuesta.equalsIgnoreCase(animales[1])) {
            System.out.println("EXCELENTE! Has ganado 10 puntos");
            puntaje += 10;
        } else {
            System.out.println("FALLASTE! La respuesta correcta es: " + animales[1]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5;
        }
    }

    public void imprimePreguntas() {
        System.out.println("*** NIVEL 1 ***");
        System.out.println("¿Es un animal que maulla y come pescado?");
        respuesta = scanneranimal.nextLine();
        puntajePerro();

        System.out.println("¿Es un animal que canta y come semillas?");
        respuesta = scanneranimal.nextLine();
        puntajeGato();

        System.out.println("\n=== NIVEL 2 ===");

        String[][] preguntasNivel2 = {
            {"Animal que es alto y come plantas", "jirafa"},
            {"Animal que salta y tiene orejas largas", "conejo"},
            {"Animal que vive en la selva y es el rey", "león"},
            {"Animal que es el mas grande en el mar", "ballena"}
        };

        for (int i = 0; i < preguntasNivel2.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntasNivel2[i][0]);
            System.out.print("Respuesta: ");
            respuesta = scanneranimal.nextLine();
            if (respuesta.equalsIgnoreCase(preguntasNivel2[i][1])) {
                System.out.println("EXCELENTE! Has ganado 20 puntos");
                puntaje += 20;
            } else {
                System.out.println("FALLASTE! La respuesta correcta es: " + preguntasNivel2[i][1]);
                System.out.println("Has perdido 10 puntos");
                puntaje -= 10;
            }
        }
    }
}


