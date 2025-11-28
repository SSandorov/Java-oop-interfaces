package Project;

public class Car extends Vehicle{

  private CarType type;

  public Car(String brand, String model, int year, CarType type) {
      super(brand, model, year);
      this.type = type;
  }

  @Override
  public void start() {
      System.out.println("El coche esta encendido");
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Car{");
      sb.append("type=").append(type);
      sb.append('}');
      sb.append(super.toString());
      return sb.toString();
  }


}