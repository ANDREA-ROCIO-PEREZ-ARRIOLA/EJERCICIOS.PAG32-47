package EjerciciosPag47;

abstract class Personal {

    /*Desarrollar un programa en el que se 
    cree la clase abstracta Personal con los métodos Registrar y calcular
    Sueldo, los cuales deberán ser implementados en una clase que herede 
    de dicha clase abstracta. */
    private int id;
    private String nombre;

    public Personal() {
    }

    public Personal(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract void registrar();
    abstract double calcularSueldo();

}
