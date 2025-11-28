package Project;

public abstract class Vehicle {
  private String brand;
  private String model;
  private int year;

  public Vehicle(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;
  }

  public abstract void start();

  public void stop() {
    System.out.println("El vehiculo se ha detenido");
  }

  public String getBrand() {
      return brand;
  }

  public String getModel() {
      return model;
  }

  public int getYear() {
      return year;
  }

  public void setBrand(String brand) {
      this.brand = brand;
  }

  public void setModel(String model) {
      this.model = model;
  }

  public void setYear(int year) {
      this.year = year;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Vehicle{");
      sb.append("brand=").append(brand);
      sb.append(", model=").append(model);
      sb.append(", year=").append(year);
      sb.append('}');
      return sb.toString();
  }

}