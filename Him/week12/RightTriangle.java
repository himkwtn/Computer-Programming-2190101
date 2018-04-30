package shape;

public class RightTriangle extends Shape {
	boolean isVerticalFlip;
	boolean isDuplicated;

	public boolean isVerticalFlip() {
		return isVerticalFlip;
	}

	public void setVerticalFlip(boolean isVerticalFlip) {
		this.isVerticalFlip = isVerticalFlip;
	}
	
	public RightTriangle(int rows, char character) {
		super(rows, character);
	}
	
	public void draw() {
		int num = 1, space = rows-1;
		for (int i=0; i<rows; i++) {
			if (isVerticalFlip) for (int sp=0; sp<space; sp++) System.out.print(" ");
			for (int j=0; j<num; j++) System.out.print(character);
			System.out.println("");
			space--;
			num++;
		}
		isDuplicated = false;
	}
	
	public void draw(int x, int y) {
		int num = 1, space = rows-1;
		for (int i=0; i<y; i++) System.out.print("\n");
		for (int i=0; i<rows; i++) {
			for (int in=0; in<x; in++) System.out.print(" ");
			if (isVerticalFlip) for (int sp=0; sp<space; sp++) System.out.print(" ");
			for (int j=0; j<num; j++) System.out.print(character);
			System.out.println("");
			space--;
			num++;
		}
		isDuplicated = false;
	}
	
	public void drawDuplicated() {
		int num = 1, space = rows-1;
		for (int i=0; i<rows; i++) {
			for (int sp=0; sp<space; sp++) System.out.print(" ");
			for (int j=0; j<num; j++) System.out.print(character);
			//for indents for (int in=0; in<x; in++) System.out.print(" ");
			for (int j=0; j<num; j++) System.out.print(character);
			System.out.println("");
			space--;
			num++;
		}
		isDuplicated = true;
	}
	
	public void drawDuplicated(int x, int y, int z) {
		int num = 1, space = rows-1;
		for (int i=0; i<y; i++) System.out.print("\n");
		for (int i=0; i<rows; i++) {
			for (int in=0; in<x; in++) System.out.print(" ");
			for (int sp=0; sp<space; sp++) System.out.print(" ");
			for (int j=0; j<num; j++) System.out.print(character);
			//for indents 
			for (int in=0; in<z; in++) System.out.print(" ");
			for (int j=0; j<num; j++) System.out.print(character);
			System.out.println("");
			space--;
			num++;
		}
		isDuplicated = true;
	}
	
	public double getArea() {
		double x = (rows*rows)/2.0;
		return (!isDuplicated) ? x : x*2 ;
	}
	
	public double getPerimeter() {
		double x = Math.floor(((Math.sqrt(Math.pow(rows, 2) + Math.pow(rows, 2)) + rows*2)*100))/100;
		return (!isDuplicated) ? x : x*2;
	}
	
	@Override
	public String toString() {
		return "Right Triangle: " + super.toString();
	}
}
