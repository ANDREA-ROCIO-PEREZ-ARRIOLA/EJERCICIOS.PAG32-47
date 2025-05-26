package EjercicioPag43;

public class Masajista extends Integrantes {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
    }

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("Dando masaje...");
    }

    @Override
    public void concentrarse() {
        System.out.println("Masajista concentrado...");
    }
    
    @Override
    public void viajar() {
        System.out.println("Masajista viajando...");
    }
}
