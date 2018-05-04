public class Vehicle {
	private int maxSpeed;
	private int numberOfPassengers;
	public Vehicle(int maxSpeed, int numberOfPassengers) {
		this.setMaxSpeed(maxSpeed);
		this.setNumberOfPassengers(numberOfPassengers);
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}