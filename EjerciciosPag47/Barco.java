package EjerciciosPag47;

public class Barco extends Vehiculo {

    private int numeroDeMastiles;

    public Barco() {
        
    }

    public Barco(String marca, String modelo, int numeroDeMastiles) {
        super(marca, modelo);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public int getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }

    @Override
    public void moverse() {
        System.out.println("El barco " + getMarca() + " " + getModelo() + " se está moviendo por el agua.");
    }

}
