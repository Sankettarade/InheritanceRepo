package assignment;

public class Main {

	public static void main(String[] args) {
		 // Create the objects of class and pass argument
        Vehicle vehicle = new Vehicle("White", "Generic", "Vehicle", 2022);
        Car car = new Car("Black", "Toyota", "Innova", 2024, 2, "Automatic");
        Truck truck = new Truck("Red", "Tata", "F-155", 2021, 7.5, 20000);
        ElectricCar electricCar = new ElectricCar("Gold", "Kia", "EV 6", 2023, 3, "Automatic", 200, 400);
        GasolineCar gasolineCar = new GasolineCar("Silver", "Tata", "Nexon.ev", 2021, 4, "Manual", 45, 25);

        // Display information of each vehicle
        System.out.println("Vehicle Information:");
        vehicle.displayInfo();
        System.out.println("\nCar Information:");
        car.displayInfo();
        System.out.println("\nTruck Information:");
        truck.displayInfo();
        System.out.println("\nElectric Car Information:");
        electricCar.displayInfo();
        System.out.println("\nGasoline Car Information:");
        gasolineCar.displayInfo();

     // Demonstrate polymorphism
        // create the array of Vehicles
        Vehicle[] vehicles = {car, truck, electricCar, gasolineCar};
        System.out.println("\nPolymorphism Demonstration:");
        // for each loop
        for (Vehicle v : vehicles) 
        {
            System.out.println("\nVehicle Type: " + v.getClass().getSimpleName());
            v.displayInfo();
            if (v instanceof ElectricVehicle)
            {
                ((ElectricVehicle) v).chargeBattery();
            }
            if (v instanceof GasolineVehicle) 
            {
                ((GasolineVehicle) v).refillfuel();
            }
        }
    }
}
