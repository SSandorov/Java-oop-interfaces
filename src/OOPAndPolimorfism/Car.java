package OOPAndPolimorfism;

public class Car extends Vehicle {

  //? Composicion o herencia
  /* 
  * Para saber si la relacion es de herencia debemos responder:
  *   - X ES Y
  * Para saber si la relacion es de composicion debemos responder:
  *   - X TIENE Y
  * 
  * Ejemplo en este caso
  * 
  * El coche ES un vehiculo
  * El coche TIENE puertas
  * El coche TIENE motor
  */

  private int doors;
  private Engine engine;
  
  public Car(String brand, String model, int year, int doors) {
      super(brand, model, year);
      this.doors = doors;
      this.engine = new Engine();
  }

  public int getDoors() {
    return this.doors;
  }
  public void setDoors(int doors) {
    this.doors = doors;
  }

  //? Polimorfismo en tiempo de ejecucion (sobreescritura)
  //! Lo era cuando la superclase tenia este metodo
  // @Override
  // public void start() {
  //   System.out.println("Encendiendo el coche");
  // }

  public void start() {
    System.out.println("Encendiendo el coche");
    engine.start();
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Car{");
      sb.append("doors=").append(doors);
      sb.append('}');
      sb.append(super.toString());
      return sb.toString();
  }

  
}