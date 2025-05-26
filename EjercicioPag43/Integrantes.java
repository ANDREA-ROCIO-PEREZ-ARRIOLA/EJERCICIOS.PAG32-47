package EjercicioPag43;

public class Integrantes {

    /* Examine las tres clases presentadas en la imagen y extraiga los elementos comunes que se pueden declarar en 
una superclase. Después, desarrolle la estructura de clases implementando el Pilar Herencia de la Programación 
Orientada a Objetos.
 a. En la siguiente figura se muestran tres clases candidatas, examinarlas y extraer los 
elementos comunes que se pueden declarar en una superclase y luego desarrollar la 
estructura  */

private int id;
private String nombre;
private String apellido;
private int edad;

public Integrantes() {
}

public Integrantes(int id, String nombre, String apellido, int edad) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
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

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

  public void concentrarse(){
       System.out.println("Modo concentración..."); 
    }

    public void viajar(){
       System.out.println("Viajando..."); 
    }

}
