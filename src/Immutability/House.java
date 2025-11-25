package Immutability;

//* Las clases inmutables no pueden ser superclases
public final class House {
  private final int doors;
  private final int windows;
  private final double size;

    public House(int doors, double size, int windows) {
        this.doors = doors;
        this.size = size;
        this.windows = windows;
    }

  //* Solo permite getters
  public int getDoors() {
    return this.doors;
  }
  public int getWindows() {
    return this.windows;
  }
  public double  getSize() {
    return this.size;
  }

}