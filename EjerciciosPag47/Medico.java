package EjerciciosPag47;

public class Medico implements IProfesion {
     private double salarioBase;
    private int consultas;
    private double pagoPorConsulta;

    // Constructor
    public Medico(double salarioBase, int consultas, double pagoPorConsulta) {
        this.salarioBase = salarioBase;
        this.consultas = consultas;
        this.pagoPorConsulta = pagoPorConsulta;
    }


    @Override
    public double calcularSueldo() {
        return salarioBase + (consultas * pagoPorConsulta);
    }

}
