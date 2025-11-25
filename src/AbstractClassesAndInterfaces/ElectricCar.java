package AbstractClassesAndInterfaces;

public class ElectricCar extends Vehicle implements Electric, SelfDrive {
  private int batteryLevel;

    public ElectricCar(String brand, String model, int year, int batteryLevel) {
        super(brand, model, year);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void drive() {
        System.out.println("Encendido el coche electrico");
    }

    @Override
    public void chargeBattery() {
        this.batteryLevel = MAX_BATTERY_CAPACITY;
        System.out.println("La bateria esta cargada al 100%");
    }

    @Override
    public void activateAutopilot() {
        System.out.println("Modo piloto automatico activado");
    }
  
}