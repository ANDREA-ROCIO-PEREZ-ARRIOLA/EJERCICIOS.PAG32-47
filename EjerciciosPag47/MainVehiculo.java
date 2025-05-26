package EjerciciosPag47;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo auto = new Automovil("Toyota", "Corolla", 4);
        Vehiculo barco = new Barco("Yamaha", "242X", 2);
        Vehiculo avion = new Avion("Boeing", "747", 4);

        auto.moverse();
        barco.moverse();
        avion.moverse();
    }

}
