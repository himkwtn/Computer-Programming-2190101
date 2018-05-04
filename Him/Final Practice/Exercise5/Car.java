public class Car extends Vehicle{
	public Car(int maxSpeed,int numberOfPassengers,
		int engineCapacity,int horsePower) {
		super(maxSpeed,numberOfPassengers);
		this.setEngineCapacity(engineCapacity);
		this.setHorsePower(horsePower);
	}
	private int engineCapacity;
	private int horsePower;
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
}