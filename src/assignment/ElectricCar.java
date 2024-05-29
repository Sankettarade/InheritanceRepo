package assignment;

public class ElectricCar extends Car implements ElectricVehicle{
	private double batteryCapacity;
	private double range;
	// constructor
	public ElectricCar(String color, String make, String model, int year, int numDoors, String transmissionType, double batteryCapacity, double range)
	{
		super(color, make, model, year, numDoors, transmissionType);
		this.batteryCapacity = batteryCapacity;
		this.range = range;
	}
	public double getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	// Method override
	@Override
	public void chargeBattery() {
		
		System.out.println("Charging the battery of car");
	}
		
}
