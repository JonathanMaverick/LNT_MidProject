
public class Car extends Vehicle{
	
	int entertaiment;

	public Car(String type, String brand, String name, String license, int speed, int gas, int wheel, int entertaiment) {
		super(type, brand, name, license, speed, gas, wheel);
		// TODO Auto-generated constructor stub
		this.entertaiment = entertaiment;
	}
	
	public void sound () {
		System.out.println("Turning on entertainment system...");
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLicense() {
		return license;
	}
	
	public String getType() {
		return type;
	}
	
	public int getGas() {
		return gas;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getWheel() {
		return wheel;
	}

	public int getEntertaiment() {
		return entertaiment;
	}

	
}
