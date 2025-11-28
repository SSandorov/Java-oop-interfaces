package AbstractClassesAndInterfaces;

public class ElectricCar extends Vehicle implements Electric, SelfDrive {
  private int batteryLevel;

    public ElectricCar(int batteryLevel, String brand, Color color, String model, VehicleStatus vehicleStatus, int year) {
        super(brand, color, model, vehicleStatus, year);
        this.batteryLevel = batteryLevel;
    }

    public ElectricCar(int batteryLevel, String brand, String model, int year) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ElectricCar{");
        sb.append("batteryLevel=").append(batteryLevel);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }


  
}