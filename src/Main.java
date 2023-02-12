import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		
		int menu = 0; 
		do {
			System.out.println("1.Input");
			System.out.println("2.View");
			System.out.println("3.Exit");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1:
				String type, brand, name, license, types;
				int speed, gas, wheel;
				
				do {
					System.out.println("Input type [Car | Motorcycle]");
					types = scan.nextLine();
				}while(!types.equals("Car") && !types.equals("Motorcycle"));
				
				if (types.equals("Car")) {
					int entertaiment;
					do {
						System.out.println("Input Brand [>= 5]");
						brand = scan.nextLine();
					}while(brand.length() <  5);
					do {
						System.out.println("Input Name [>= 5]");
						name = scan.nextLine();
					}while(name.length() <  5);
					do {
						System.out.println("Input license");
						license = scan.nextLine();
					}while(!license.matches("[A-Z]{1,2} [0-9]{1,4} [A-Z]{1,3}"));
					do {
						System.out.println("Input top speed [100 <= top speed <= 250] ");
						speed = scan.nextInt();
					}while(speed < 100 || speed > 250);
					do {
						System.out.println("Input gas capacity [30 <= gasCap <= 60] ");
						gas = scan.nextInt();
					}while(gas < 30 || gas > 60);
					do {
						System.out.println("Input wheel [4 <= wheel <= 6] ");
						wheel = scan.nextInt();
					}while(wheel < 4 || wheel > 6);
					scan.nextLine();
					do {
						System.out.println("Input type [SUV | Supercar | Minivan] ");
						type = scan.nextLine();
					}while(!type.equals("SUV") && !type.equals("Supercar") && !type.equals("Minivan"));
					do {
						System.out.println("Input entertaiment system ammount [>= 1] ");
						entertaiment = scan.nextInt();
					}while(entertaiment < 1);
					scan.nextLine();
					vehicleList.add(new Car(type, brand, name, license, speed, gas, wheel, entertaiment));
				}
				else if (types.equals("Motorcycle")) {
					int helm;
					do {
						System.out.println("Input Brand [>= 5]");
						brand = scan.nextLine();
					}while(brand.length() <  5);
					do {
						System.out.println("Input Name [>= 5]");
						name = scan.nextLine();
					}while(name.length() <  5);
					do {
						System.out.println("Input license");
						license = scan.nextLine();
					}while(!license.matches("[A-Z]{1,2} [0-9]{1,4} [A-Z]{1,3}"));
					do {
						System.out.println("Input top speed [100 <= top speed <= 250] ");
						speed = scan.nextInt();
					}while(speed < 100 || speed > 250);
					do {
						System.out.println("Input gas capacity [30 <= gasCap <= 60] ");
						gas = scan.nextInt();
					}while(gas < 30 || gas > 60);
					do {
						System.out.println("Input wheel [2 <= wheel <= 3] ");
						wheel = scan.nextInt();
					}while(wheel < 2 || wheel > 3);
					scan.nextLine();
					do {
						System.out.println("Input type [Automatic | Manual] ");
						type = scan.nextLine();
					}while(!type.equals("Manual") && !type.equals("Automatic"));
					do {
						System.out.println("Input helm [>= 1] ");
						helm = scan.nextInt();
					}while(helm < 1);
					scan.nextLine();
					vehicleList.add(new Motorcycle(type, brand, name, license, speed, gas, wheel, helm));
				}
				System.out.println("Enter to return");
				scan.nextLine();
				break;
			case 2:
				int choose;
				int i = 1;
				System.out.println("|-----|---------------|---------------|");
				System.out.println("|No   |Type           |Name           |");
				System.out.println("|-----|---------------|---------------|");
				for(Vehicle vehicle : vehicleList) {
					if (vehicle instanceof Car)
					{
						System.out.printf("|%-5d|" + "%-15s|" + "%-15s|%n" , i , "Car" ,((Car) vehicle).getName());
					}else if (vehicle instanceof Motorcycle)
					{
						System.out.printf("|%-5d|" + "%-15s|" + "%-15s|%n" , i , "Motorcycle" ,((Motorcycle) vehicle).getName());
					}
					 i = i + 1;
				}
				System.out.println("|-----|---------------|---------------|");
				System.out.println("Pick a vehicle number to test drive[Enter '0' to exit]:");
				choose = scan.nextInt();
				
				if (choose == 0) {
					break;
				}else {
					choose -= 1;
					Vehicle vehicle = vehicleList.get(choose);
					if (vehicle instanceof Car)
					{
						String typeCar = ((Car) vehicle).getType();
						System.out.println("Brand: " + ((Car) vehicle).getBrand());
						System.out.println("Name: " + ((Car) vehicle).getName());
						System.out.println("License Plate: " + ((Car) vehicle).getLicense());
						System.out.println("Type: " + ((Car) vehicle).getType());
						System.out.println("Gas Capacity: " + ((Car) vehicle).getGas());
						System.out.println("Top Speed: " + ((Car) vehicle).getSpeed());
						System.out.println("Wheel: " + ((Car) vehicle).getWheel());
						System.out.println("Entertainment System: " + ((Car) vehicle).getEntertaiment());
						((Car)vehicle).sound();
						if (typeCar.equals("Supercar"))
						{
							System.out.println("Boosting!");
						}
						System.out.println();
						
					}else if (vehicle instanceof Motorcycle)
					{
						System.out.println("Brand: " + ((Motorcycle) vehicle).getBrand());
						System.out.println("Name: " + ((Motorcycle) vehicle).getName());
						System.out.println("License Plate: " + ((Motorcycle) vehicle).getLicense());
						System.out.println("Type: " + ((Motorcycle) vehicle).getType());
						System.out.println("Gas Capacity: " + ((Motorcycle) vehicle).getGas());
						System.out.println("Top Speed: " + ((Motorcycle) vehicle).getSpeed());
						System.out.println("Wheel: " + ((Motorcycle) vehicle).getWheel());
						System.out.println("Entertainment System: " + ((Motorcycle) vehicle).getHelm());
						((Motorcycle)vehicle).sound();
						System.out.println("Helm price? : ");
						int price;
						price = scan.nextInt();
						System.out.println("Helm rice: " + price);
						System.out.println();
					}
				}
				break;
			}
		}while(menu != 3);
	}

}
