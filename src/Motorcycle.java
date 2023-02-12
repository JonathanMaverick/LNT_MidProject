
public class Motorcycle extends Vehicle {

	int helm;

	public Motorcycle(String type, String brand, String name, String license, int speed, int gas, int wheel, int helm) {
		super(type, brand, name, license, speed, gas, wheel);
		// TODO Auto-generated constructor stub
		this.helm = helm;
	}
	
	public void sound () {
		System.out.println(name + " is standing!");
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

	public int getHelm() {
		return helm;
	}

}
