package Day_2;

class Vehicle {
	String brand;
	int speed;

	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	public void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + speed + " km/h");
	}
}

class Car extends Vehicle {
	int numberOfDoors;

	public Car(String brand, int speed, int numberOfDoors) {
		super(brand, speed);
		this.numberOfDoors = numberOfDoors;
	}

	public void displayCarInfo() {
		displayInfo();
		System.out.println("Number of Doors: " + numberOfDoors);
		System.out.println("--------------------------");
	}
}

class Bike extends Vehicle {
	boolean hasGear;

	public Bike(String brand, int speed, boolean hasGear) {
		super(brand, speed);
		this.hasGear = hasGear;
	}

	public void displayBikeInfo() {
		displayInfo();
		System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
		System.out.println("--------------------------");
	}
}

public class VehicalInheritance
{
	public static void main(String[] args) 
	 {
	     Car car = new Car("Toyota", 120, 4);
	     Bike bike = new Bike("Hero", 80, true);
	
	     System.out.println("Car Details:");
	     car.displayCarInfo();
	
	     System.out.println("Bike Details:");
	     bike.displayBikeInfo();
	 }
}
