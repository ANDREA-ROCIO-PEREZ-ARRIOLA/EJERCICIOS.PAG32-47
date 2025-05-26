package EjerciciosPag47;

public class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil() {
        
    }

    public Automovil(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void moverse() {
        System.out.println("El automóvil " + getMarca() + " " + getModelo() + " se está moviendo por la carretera.");
    }

}
