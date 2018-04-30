package shape;

public class Square extends Shape {
	
	public Square(int rows) {
		super(rows);
	}
	
	public Square(int rows, char character) {
		super(rows, character);
	}
	
	public void draw() {
		for (int i=0; i<rows; i++) {
			for (int j=0; j<rows; j++) System.out.print(""+character);
			System.out.println("");
		}
	}
	
	public void draw(int x, int y) {
		for (int i=0; i<y; i++) System.out.print("\n");
		for (int i=0; i<rows; i++) {
			for (int in=0; in<x; in++) System.out.print(" ");
			for (int j=0; j<rows; j++) {
				System.out.print(""+character);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public double getArea() {
		return rows*rows;
	}
	
	public double getPerimeter() {
		return rows*4;
	}
	
	@Override
	public String toString() {
		return "Square: "+super.toString();
	}
}
