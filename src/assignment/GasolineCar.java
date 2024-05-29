package assignment;

public class GasolineCar extends Car implements GasolineVehicle{
   private double fuelCapacity;
   private double mpg;
   //constructor
   public GasolineCar(String color, String make, String model, int year, int numDoors, String transmissionType, double fuelCapacity, double mpg)
    {
	   super(color, make, model, year, numDoors, transmissionType);
	   this.fuelCapacity = fuelCapacity;
	   this.mpg = mpg;
    }
     public double getFuelCapacity() {
	    return fuelCapacity;
      }
     public void setFuelCapacity(double fuelCapacity) {
	    this.fuelCapacity = fuelCapacity;
      }
     public double getMpg() {
	    return mpg;
      }
    public void setMpg(double mpg) {
     	this.mpg = mpg;
      }

    // Method override
    @Override
    public void refillfuel()
    {
	
	  System.out.println("Refilling the fuel");
    }
     
}