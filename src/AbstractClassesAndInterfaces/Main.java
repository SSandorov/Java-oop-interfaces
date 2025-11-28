package AbstractClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        //* Una clase abstracta no puede tener instancias de forma directa
        //* Debe ser creada con una clase anonima

        //* Una clase anonima es una clase sin nombre que se declara y se instancia
        //* de una vez
        // Vehicle vehicle = new Vehicle("Fiat", "500", 2010) {
        //     @Override
        //     public void drive() {
        //         System.out.println("Conduciendo");
        //     }
        // };

        // System.out.println(vehicle.toString());

        Vehicle electic = 
            new ElectricCar(80, "Fiat", Color.RED, "Duna", VehicleStatus.AVAILABLE, 2025  );

        System.out.println(electic.toString());
    }
}