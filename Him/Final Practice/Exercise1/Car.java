public class Car extends Vehicle{
	private int cc;
	private String engine;
	private String type;
	public Car(String model, String year, int wheels, int cc, String engine, String type){
		super(model, year, wheels);
		this.cc = cc;
		this.engine = engine;
		this.type = type;
	}
	public String getSpec(){
		return super.getSpec() + " " + cc + " " + engine + " " + type;
	}
	public void calDeposit(int days){
		if( cc <= 1800 && type == "compact")
			rentalRate = 19.99*days;
		else if ( cc <= 1800 && type.equals("medium") )
			rentalRate = 25.99*days;
		else if ( cc <= 2500 && type.equals("medium"))
			rentalRate = 29.99 * days;
		else if( cc <= 2500 && type.equals("SUV"))
			rentalRate = 26.99*days;
	}
}