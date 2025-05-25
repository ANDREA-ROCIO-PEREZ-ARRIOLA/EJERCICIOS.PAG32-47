package EjercicioPag40;

public class Main {
    public static void main(String[] args) {
       Animal animal = new Animal();

       //Constructor vacío de la clase Animal
       animal.setNombre("Nombre: Perro");
       animal.setOrden("Orden: Carnivoro");
       animal.setExtremidades("Extremidades: Cuatro patas");
       System.out.println(animal.getNombre());
       System.out.println(animal.getOrden());
       System.out.println(animal.getExtremidades());

    }

}
 