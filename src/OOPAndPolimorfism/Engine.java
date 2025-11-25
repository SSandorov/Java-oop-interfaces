package OOPAndPolimorfism;

public class Engine {
  
  public void start() {
    System.out.println("Motor encendido");
  }

  //? Polimorfismo en tiempo de compilacion (sobrecarga)
  public void start(boolean silentMode) {
    if (silentMode) {
      System.out.println("Esta encendido en modo silencioso");
    } else {
      System.out.println("Encendiendo el vehiculo");
    }
  }
  
}