package shape;

public class Shape {
	int rows;
	char character;
	
	public Shape(int rows) {
		super();
		this.rows = rows;
	}
	
	public Shape(int rows, char character) {
		super();
		this.rows = rows;
		this.character = character;
	}
	
	public int getRows() {
		return rows;
	}
	
	public void setRows(int rows) {
		this.rows = rows;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}
	
	public String toString() {
		return "rows="+rows+" and character="+character;
	}
}
