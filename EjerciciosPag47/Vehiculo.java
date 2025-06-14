package EjerciciosPag47;

public class Vehiculo {

    /*1. Desarrollar un programa en que se defina la clase principal Vehículo y se creen tres clases derivadas de ésta: 
Automóvil, Barco y Avión; las clases derivadas deberán sobrescribir por lo menos un método de la clase 
principal utilizando polimorfismo. */

 private String marca;
 private String modelo;

 public Vehiculo() {
 }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
 

}
