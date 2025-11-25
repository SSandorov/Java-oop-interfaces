package OOPAndPolimorfism;

public class Main {
    public static void main(String[] args) {

        //* Poniendo el tipo de dato como la superclase de vehiculo aplicamos el polimorfismo de inclusion
        Vehicle myCar = new Car("Toyota", "Corolla", 2021, 4);
        Vehicle myBike = new Motorbike("Honda", "CBR", 2021, false);

        //* La razon por la que no se castea con estos metodos es porque pertenecen a la superclase
        //! Lo era cuando la clase tenia el metodo
        // myCar.start();
        // myBike.start();



        //* Para poder modificar las propiedades de una subclase cuando se emplea el polimorfismo de inclusion,
        //* se debe 'castear'
        ((Car)myCar).start();
        ((Motorbike)myBike).start();
        ((Car)myCar).setDoors(5);

        printVehicle(myCar);
        printVehicle(myBike);
    }

    //? Polimorfismo de inclusion
    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}