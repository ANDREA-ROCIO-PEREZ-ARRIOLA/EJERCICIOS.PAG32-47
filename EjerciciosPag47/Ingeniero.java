package EjerciciosPag47;

public class Ingeniero implements IProfesion{
  private double salarioBase;
    private double bono;

    // Constructor
    public Ingeniero(double salarioBase, double bono) {
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bono;
    }

}
