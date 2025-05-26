package EjercicioPag40;

public class CorrerJuegoAnimal {
public static void main(String[] args) {
    JuegoAnimales juego = new JuegoAnimales();
    
    juego.imprimePreguntas();
    
    System.out.println("\nPuntaje total acumulado: " + juego.puntaje);
    
    System.out.println("Gracias por jugar!");
}
}
