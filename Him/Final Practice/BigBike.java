public class BigBike extends Vehicle{
	private int cc;
	public BigBike(String model, String year, int wheels, int cc){
		super(model, year, wheels);
		this.cc = cc;
	}
	public String getspec(){
		return super.getSpec() + " " + cc;
	}
	public void calDeposit(int days){
		if( cc <= 120)
			rentalRate = 9.99*days;
		else if ( cc <= 300)
			rentalRate = 12.99*days;
		else
			rentalRate = 18.99 * days;
	}
}