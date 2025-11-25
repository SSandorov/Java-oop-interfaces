package OOPAndPolimorfism;

public class Bicycle extends Vehicle {
  
  private boolean hasBell;

    public Bicycle(boolean hasBell, String brand, String model, int year) {
        super(brand, model, year);
        this.hasBell = hasBell;
    }

}