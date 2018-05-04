import java.text.DecimalFormat;
public class Vehicle{
	protected String model;
	protected String year;
	protected int wheels;
	protected double rentalRate = 0;
	DecimalFormat df = new DecimalFormat("0.00");
	public Vehicle(String model, String year, int wheels){
		this.model = model;
		this.year = year;
		this.wheels = wheels;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getSpec(){
		return model + " " + year + " " + wheels + " " ;
	}
	public String getRentalRate(){
		return df.format(rentalRate);
	}
}