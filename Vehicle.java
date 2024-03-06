import java.time.Year;

public class Vehicle {

	private String regNo;
	private String brand;
	private String model;
	private int year;
	private double price;

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo){
		this.regNo = regNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model){
		this.model = model;
	}

	public int getYear(){
		return year;
	}

	public void setYear(int year){
		this.year= year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int calculateAge(){
		return Year.now().getValue() - year;
	}

	public Vehicle(String regNo, String brand, String model, int year, double price) {
		this.regNo = regNo;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
}
