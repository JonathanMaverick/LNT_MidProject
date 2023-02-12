
public abstract class Vehicle {
	
	String type;
	String brand;
	String name;
	String license;
	int speed;
	int gas;
	int wheel;
	
	public Vehicle(String type, String brand, String name, String license, int speed, int gas, int wheel) {
		super();
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.speed = speed;
		this.gas = gas;
		this.wheel = wheel;
	}

}
