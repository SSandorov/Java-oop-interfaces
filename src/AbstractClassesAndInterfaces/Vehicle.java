package AbstractClassesAndInterfaces;

//* Las clases abstractas se crean para ser heredadas
public abstract class Vehicle {
  private String brand;
  private String model;
  private int year;

  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  public String getBrand() {
    return this.brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return this.model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return this.year;
  }
  public void setYear(int year) {
    int currentYear = java.time.Year.now().getValue();

    if(year < 1866 || year > currentYear + 2) {
      throw new IllegalArgumentException("Invalid year");
    }
    this.year = year;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            '}';
  }
  
  public void stop() {
    System.out.println("Parando el vehiculo");
  }

  //* Tambien podemos definir metodos de tipo abstracto que seran heredados
  //* e implementados por las subclases
  public abstract void drive();
}