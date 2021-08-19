package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	
	public Car(double cost, double amount) {
		this.fuelCost = cost;
		this.fuelAmount = amount;
	}
	
	public void move(int distance) {
		System.out.println(distance + "km走ります");
		this.fuelAmount -= (distance / fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
