import java.util.Scanner;

public class VehicleTest{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Vehicle[] vehicles = new Vehicle[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Please enter brand model and registration no of vehicle " + (i+1) + ": ");
			String[] input1 = input.nextLine().split(" ");
			String brand = input1[0];
			String model = input1[1];
			String regNo = input1[2];
			System.out.println("Please enter year and price of vehicle " + (i+1) + ": ");
			String[] input2 = input.nextLine().split(" ");
			int year = Integer.parseInt(input2[0]);
			double price = Double.parseDouble(input2[1]);
			vehicles[i] = new Vehicle(regNo, brand, model, year, price);
		}

		for (int i = 0; i < 3; i++) {
			double currentPrice = vehicles[i].getPrice();
			System.out.println("Please enter new price for " + vehicles[i].getBrand() + " " + vehicles[i].getModel() + ": ");
			double newPrice = input.nextDouble();
			if (newPrice >= currentPrice * 0.8 && newPrice <= currentPrice * 1.2) {
				vehicles[i].setPrice(newPrice);
			} 
			else {
				System.out.println("New price must be at most 20% more or less than the current price");
				return;
			}
			input.nextLine();
		}

		for (int i = 0; i <3; i++){
			Vehicle vehicle = vehicles[i];
			System.out.println("Information about vehicle " +(i+1) + ":");
			System.out.println("Brand: " + vehicle.getBrand());
			System.out.println("Model: " + vehicle.getModel());
			System.out.println("Registration number: " + vehicle.getRegNo());
			System.out.println("Year: " + vehicle.getYear());
			System.out.println("Price: " + vehicle.getPrice());
			System.out.println("Age: " + vehicle.calculateAge());
			System.out.println(" ");
		}

		input.close();
	}
}

