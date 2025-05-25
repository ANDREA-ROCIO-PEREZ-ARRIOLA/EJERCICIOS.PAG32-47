package EjercicioPag40;

public class Main {
    public static void main(String[] args) {
       Animal animal = new Animal();

       System.out.println("CLASE ANIMAL");

       //Constructor vacío de la clase Animal
       System.out.println("CONSTRUCTOR VACIO");

       animal.setNombre("Nombre: Perro");
       animal.setOrden("Orden: Carnivoro");
       animal.setExtremidades("Extremidades: Cuatro patas");
       System.out.println(animal.getNombre());
       System.out.println(animal.getOrden());
       System.out.println(animal.getExtremidades());

       System.out.println("------------------------------------------------------------");

         //Constructor con parámetros de la clase Animal
       System.out.println("CONSTRUCTOR CON PARAMETROS");

         Animal animal2 = new Animal("Nombre: Gato", "Orden: Carnivoro", "Extremidades: Cuatro patas");
            System.out.println(animal2.getNombre());
            System.out.println(animal2.getOrden());
            System.out.println(animal2.getExtremidades());


    }

}
 