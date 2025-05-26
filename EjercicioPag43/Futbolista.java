package EjercicioPag43;

public class Futbolista extends Integrantes{

    private int dorsal;
    private String demarcacion;

    Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("Jugando partido...");
    }

    public void entrenar() {
        System.out.println("Entrenando...");
    }

    @Override   
    public void concentrarse() {
        System.out.println("Concentrándose el futbolista: ");
    }
    @Override
    public void viajar() {
        System.out.println("Viajando el futbolista: ");
    }
}
