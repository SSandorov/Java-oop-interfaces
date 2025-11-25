package OOPAndPolimorfism;

public class Motorbike extends Vehicle {
  private boolean hasSidecar;
  private Engine engine;
  
  public Motorbike(String brand, String model, int year, boolean hasSidecar) {
      super(brand, model, year);
      this.hasSidecar = hasSidecar;
      this.engine = new Engine();
  }

  public void popWheelie() {
    System.out.println("La moto esta haciendo willy");
  }

  @Override
  public String toString() {
    return "Motorbike{" +
            "hasSidecar=" + hasSidecar +
            '}' + super.toString();
  }

  public void start() {
    System.out.println("Encendiendo la moto");
    this.engine.start();
  }

}