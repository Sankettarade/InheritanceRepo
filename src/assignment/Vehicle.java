package assignment;

public class Vehicle {
   private String color;
   private String make;
   private String model;
   private int year;
     // constructor
   public Vehicle(String color, String make, String model, int year)
   {
	   this.color = color;
	   this.make = make;
	   this.model = model;
	   this.year = year;
   }
   
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
   
   public void displayInfo()
   {
	   System.out.println("Color : "+color);
	   System.out.println("Make : "+make);
	   System.out.println("Model : "+model);
	   System.out.println("Year : "+year);
   }
}
