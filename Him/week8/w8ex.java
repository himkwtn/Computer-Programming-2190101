public class w8ex {
	public static void main(String[] args) {
		System.out.println("First line\nSecond line" + blankline() + "Third line");		
		System.out.println(fibonacci(8));
	}
	public static String blankline() {
		return "\n\n";
	}
	public static int fibonacci(int n){
		if( n <= 2) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
}