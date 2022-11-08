package com.company;
// This is the practice set of interface and inheritance

 interface Vehicle{
   public boolean isMotorized();   //it is a abstract method;
      public  int numberOfGear();

}
interface CarInterface{
 public  String getCompany();
}
class UseVehicle{
 int door = 4;
}
public class Car extends UseVehicle implements Vehicle, CarInterface {
// We can implement 1 or more class but cannot extend more than one class

  @Override
  public boolean isMotorized () {
   return true;
  }

  @Override
  public int numberOfGear () {
   return 5;
  }

  @Override
  public String getCompany () {
   return null;
  }
  public void print () {
   System.out.println(door);
  }
 }
