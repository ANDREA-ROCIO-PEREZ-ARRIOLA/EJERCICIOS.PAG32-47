package EjerciciosPag47;

public class EmpleadoAbstracto extends Personal {

    private double salario;
    private int horasExtra;
   private double pagoPorHora;

    public EmpleadoAbstracto() {
    }

    public EmpleadoAbstracto(int id, String nombre, double salario, int horasExtra, double pagoPorHora) {
        super(id, nombre);
        this.salario = salario;
        this.horasExtra = horasExtra;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSueldo() {
         return salario + (horasExtra * pagoPorHora);

    }

    @Override
    public void registrar() {
        System.out.println("Empleado registrado: " + getNombre() + ", ID: " + getId() + ", Salario: " + salario);
    }

}
