package EjerciciosPag47;

public class MainPersonalAbstract {
    public static void main(String[] args) {
        EmpleadoAbstracto empleado1 = new EmpleadoAbstracto(1,"Rocio", 5000, 10, 20);
        
        empleado1.registrar();
        System.out.println("Sueldo calculado: $" + empleado1.calcularSueldo());

    }

}
