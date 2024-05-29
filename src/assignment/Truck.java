package assignment;

public class Truck extends Vehicle{
	private double bedSize;
	private double towingCapacity;
	// constructor
	public Truck(String color, String make, String model, int year, double bedSize, double towingCapacity)
	{
		super(color, make, model, year);
		this.bedSize = bedSize;
		this.towingCapacity = towingCapacity;
	}
	public double getBedSize() {
		return bedSize;
	}
	public void setBedSize(double bedSize) {
		this.bedSize = bedSize;
	}
	public double getTowingCapacity() {
		return towingCapacity;
	}
	public void setTowingCapacity(double towingCapacity) {
		this.towingCapacity = towingCapacity;
	}
	
	@Override
	public void displayInfo()
	{
		System.out.println("Size of bed : "+bedSize);
		System.out.println("Towing capacity : "+towingCapacity);
	}

}
