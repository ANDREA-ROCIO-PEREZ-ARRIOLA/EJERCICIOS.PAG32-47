package EjerciciosPag47;

public class Avion extends Vehiculo {

    private int numeroDeMotores;

    public Avion() {
        
    }

    public Avion(String marca, String modelo, int numeroDeMotores) {
        super(marca, modelo);
        this.numeroDeMotores = numeroDeMotores;
    }

    public int getNumeroDeMotores() {
        return numeroDeMotores;
    }

    public void setNumeroDeMotores(int numeroDeMotores) {
        this.numeroDeMotores = numeroDeMotores;
    }

    @Override
    public void moverse() {
        System.out.println("El avión " + getMarca() + " " + getModelo() + " se está moviendo por el aire.");
    }

}
