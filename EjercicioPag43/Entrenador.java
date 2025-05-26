package EjercicioPag43;

public class Entrenador extends Integrantes {

    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo entrenamiento...");
    }

    public void dirigirPartido() {
        System.out.println("Dirigiendo partido...");
    }

    @Override
    public void concentrarse() {
        System.out.println("Entrenador concentrado...");
    }
    @Override
    public void viajar() {
        System.out.println("Entrenador viajando...");
    }

}
