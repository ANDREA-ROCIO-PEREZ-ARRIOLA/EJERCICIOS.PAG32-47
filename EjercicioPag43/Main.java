package EjercicioPag43;


public class Main {
public static void main(String[] args) {

     Futbolista futbolista = new Futbolista();
    futbolista.setNombre("Juan");
    futbolista.setApellido("Gomez");
    futbolista.setEdad(25);
    futbolista.setDorsal(07);
    futbolista.setDemarcacion("Delantero");
    futbolista.concentrarse();
    futbolista.viajar();
    futbolista.jugarPartido();
    futbolista.entrenar();

    System.out.println("Futbolista: " + futbolista.getNombre() + " " + futbolista.getApellido() + 
                       ", Edad: " + futbolista.getEdad() + 
                       ", Dorsal: " + futbolista.getDorsal() + 
                       ", Demarcación: " + futbolista.getDemarcacion());
    System.out.println("--------------------------------------------------");

    Entrenador entrenador = new Entrenador();
    entrenador.setNombre("Carlos");
    entrenador.setApellido("Lopez");
    entrenador.setEdad(40);
    entrenador.setIdFederacion("FED123");
    entrenador.concentrarse();
    entrenador.viajar();
    entrenador.dirigirPartido();
    entrenador.dirigirEntrenamiento();

    System.out.println("Entrenador: " + entrenador.getNombre() + " " + entrenador.getApellido() + 
                       ", Edad: " + entrenador.getEdad() + 
                       ", ID Federación: " + entrenador.getIdFederacion());
    System.out.println("--------------------------------------------------");

    Masajista masajista = new Masajista();
    masajista.setNombre("Ana");
    masajista.setApellido("Martinez");
    masajista.setEdad(35);
    masajista.setTitulacion("Fisioterapia");
    masajista.setAniosExperiencia(10);
    masajista.concentrarse();
    masajista.viajar();
    masajista.darMasaje();

    System.out.println("Masajista: " + masajista.getNombre() + " " + masajista.getApellido() + 
                       ", Edad: " + masajista.getEdad() + 
                       ", Titulación: " + masajista.getTitulacion() + 
                       ", Años de experiencia: " + masajista.getAniosExperiencia());

                       




}
}
