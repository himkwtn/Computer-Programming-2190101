import java.util.Scanner;
public class Java101{
	public static double readDoubleFromKeyboard(String prompt){
		Scanner sc = new Scanner(System.in);
		System.out.print(prompt+":");
		double d = sc.nextDouble();
		return d;
	}
	public static String typeOf(byte b){
		return "byte";
	}
	public static String typeOf(short s){
		return "short";
	}
	public static String typeOf(int i){
		return "int";
	}
	public static String typeOf(long l){
		return "long";
	}
	public static String typeOf(boolean b){
		return "boolean";
	}
	public static String typeOf(float f){
		return "float";
	}
	public static String typeOf(double d){
		return "double";
	}
	public static String typeOf(char c){
		return "char";
	}
	public static String typeOf(String s){
		return "String";
	}
	public static String typeOf(Object o){
		return "Non-primitive";
	}

	public static void showDieFace(int i){
		if(i<1||i>6){
			System.out.println("Java101.Dice.showFace() says \"The input is out-of-range.\"");
			return;
		}
		System.out.println("-------");
		switch(i){
			case 1:
				System.out.println("|     |");
				System.out.println("|  *  |");
				System.out.println("|     |");
				break;
			case 2:
				System.out.println("| *   |");
				System.out.println("|     |");
				System.out.println("|   * |");
				break;
			case 3:
				System.out.println("| *   |");
				System.out.println("|  *  |");
				System.out.println("|   * |");
				break;
			case 4:
				System.out.println("| * * |");
				System.out.println("|     |");
				System.out.println("| * * |");
				break;
			case 5:
				System.out.println("| * * |");
				System.out.println("|  *  |");
				System.out.println("| * * |");
				break;
			case 6:
				System.out.println("| * * |");
				System.out.println("| * * |");
				System.out.println("| * * |");
				break;
		}
		System.out.println("-------");
	} 
	public static void showDieFace(double d){
		System.out.println("Java101.Dice.showFace() only processes int input!");
	}
}