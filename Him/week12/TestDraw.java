package shape;

public class TestDraw {

	public static void main(String[] args) {
		
		Triangle z = new Triangle(7,'#');
		z.draw(6,0);
		
		Square x = new Square(14,'%');
		x.draw(0,0);
		
		RightTriangle y = new RightTriangle(7,'&');
		y.drawDuplicated(4,0,5);
		
	}
	
}
