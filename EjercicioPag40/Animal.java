package EjercicioPag40;

public class Animal {
/*EJERCICIO 1 Pág.40: Desarrollar una aplicación Java 
que implemente la clase Animal. 
Las propiedades que debe tener son: nombre, orden, 
extremidades debidamente encapsuladas. 
Para ello, la clase Animal debe ser creada dentro 
del mismo documento de la clase que la implementará. */

private String nombre;
private String orden;
private String extremidades;

public Animal() {
}

public Animal(String nombre, String orden, String extremidades) {
    this.nombre = nombre;
    this.orden = orden;
    this.extremidades = extremidades;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getOrden() {
    return orden;
}

public void setOrden(String orden) {
    this.orden = orden;
}

public String getExtremidades() {
    return extremidades;
}

public void setExtremidades(String extremidades) {
    this.extremidades = extremidades;
}


}
