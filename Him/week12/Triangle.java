package shape;

public class Triangle extends Shape {
	
	boolean isHorizontalFlip;
	
	public boolean isHorizontalFlip() {
		return isHorizontalFlip;
	}

	public void setHorizontalFlip(boolean isHorizontalFlip) {
		this.isHorizontalFlip = isHorizontalFlip;
	}
	
	public Triangle(int rows, char character) {
		super(rows, character);
	}

	public void draw() {
		int space = (!isHorizontalFlip) ? rows-1 : 0, num = (!isHorizontalFlip) ? 1 : rows;
		for (int i=0; i<rows; i++) {
			for (int sp=0; sp<space; sp++) System.out.print(" ");
			for (int j=0; j<num; j++) System.out.print(character+" ");
			System.out.println("");
			space += (!isHorizontalFlip) ? -1 : 1;
			num += (!isHorizontalFlip) ? 1 : -1;
		}
	}
	
	public void draw(int x, int y) {
		for (int i=0; i<y; i++) System.out.print("\n");
		int space = (!isHorizontalFlip) ? rows-1 : 0, num = (!isHorizontalFlip) ? 1 : rows;
		for (int i=0; i<rows; i++) {
			for (int in=0; in<x; in++) System.out.print(" ");
			for (int sp=0; sp<space; sp++) System.out.print(" ");
			for (int j=0; j<num; j++) System.out.print(character+" ");
			System.out.println("");
			space += (!isHorizontalFlip) ? -1 : 1;
			num += (!isHorizontalFlip) ? 1 : -1;
		}
	}
	
	public double getArea() {
		return (rows*rows)/2.0;
	}
	
	public double getPerimeter() {
		return Math.floor(((Math.sqrt(Math.pow((double)rows/2, 2) + Math.pow((double)rows, 2))*2 + rows)*100))/100;
	}
	
	@Override
	public String toString() {
		return "Triangle: " + super.toString();
	}
}
