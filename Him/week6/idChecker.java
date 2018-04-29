import java.util.Scanner;
public class idChecker{
	public static void main(String[] args) {
		// System.out.println(nodots(".."));
		// System.out.println(nodots("a.d.g "));
		// System.out.println(nodots(".asd."));
		// System.out.println(nodots("asd"));
		System.out.println(twoNum("1234"));
		System.out.println(twoNum("asdf"));
		System.out.println(twoNum("1"));
	}

	public static boolean nodots( String id){
		int len = id.length();
		for(int i = 0 ; i < len-1 ; i++){
			if(id.charAt(i) == '.' && id.charAt(i+1) == '.'){
				return false;
			}
		}
		return true;
	}

	public static boolean twoNum( String id){
		int len = id.length();
		int count = 0;

		for(int i = 0 ; i < len ; i++){
			char c = id.charAt(i);
			if(Character.isDigit(c)){
				count ++;
			}
		}
		return (count >= 2 ? true : false) ;
	}
}