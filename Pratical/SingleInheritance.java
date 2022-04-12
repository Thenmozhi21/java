class Vehicle
{
String brand="shift";
String type="4_wheeler";
}
class Car extends Vehicle
{
String modelname="Shift1324";
}
class SingleInheritance
{
public static void main(String args[])
{
Car c=new Car();
System.out.println("car brand is:"+c.brand);
System.out.println("car model is:"+c.modelname);
}
}