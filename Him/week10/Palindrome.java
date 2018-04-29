import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args) {
		while(true){
			Scanner kb = new Scanner(System.in);
			System.out.print("Enter a word: ");
			String str = kb.nextLine();
			System.out.println(palin(str));
		}
	}
	public static boolean palin(String str){
		int len = str.length();
		if(len <= 1)
			return true;
		else if(str.charAt(0) == str.charAt(len-1))
			return palin(str.substring(1,len-1));
		return false;
	}
}