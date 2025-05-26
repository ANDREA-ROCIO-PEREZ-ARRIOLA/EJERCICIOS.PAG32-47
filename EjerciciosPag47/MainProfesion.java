package EjerciciosPag47;

public class MainProfesion {

    public static void main(String[] args) {
       IProfesion ingeniero = new Ingeniero(3000, 500);
        IProfesion medico = new Medico(2500, 20, 50);

        System.out.println("Sueldo Ingeniero: $" + ingeniero.calcularSueldo());
        System.out.println("Sueldo Médico: $" + medico.calcularSueldo());
 
    }
     
    }


