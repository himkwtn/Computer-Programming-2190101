public class Garage{
	public static void main(String[] args) {
		Car Car1 = new Car("asd", "2019", 4, 1600, "gasohol", "compact");
		System.out.println(Car1.getSpec());
		Car1.calDeposit(5);
		System.out.println(Car1.getRentalRate());
	}
}