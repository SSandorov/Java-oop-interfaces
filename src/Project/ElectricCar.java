package Project;

public class ElectricCar extends Car implements Electric {
  private int batteryLevel;

  public ElectricCar(String brand, String model, int year, CarType type, int batteryLevel) {
      super(brand, model, year, type);
      this.batteryLevel = batteryLevel;
  }

  @Override
  public void start() {
      System.out.println("EL coche electrico esta encendido");
  }

  @Override
  public void chargeBattery() {
      this.batteryLevel = 100;
      System.out.println("La bateria esta cargada al 100%");
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