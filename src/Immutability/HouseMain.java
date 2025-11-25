package Immutability;

public class HouseMain {
  public static void main(String[] args) {
      House house = new House(2, 4, 10);

      System.out.println("house doors = " + house.getDoors());
  }
}