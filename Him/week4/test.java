import java.util.Scanner;

public class test{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String num; 
	while(true){
		System.out.println(" please enter a number. type \"exit\" to exit \n");
		num = sc.nextLine();

		if (num.equals("exit")) break;
		int bin = Integer.parseInt(num,32);	
		String binstring = Integer.toBinaryString(bin);
		int len = binstring.length();
		String result = "";
		
		
		 for (int i = len ; i < 32 ; i++){
		 	binstring = 0 + binstring;
		 }
		 

		 for(int i = 0  ; i < 32 ; i++){
		 	if(i%4 == 0) result += " ";
		 	result += binstring.charAt(i);
		 	
		 }

		 System.out.println(result + "\n");
	}

	sc.close();

	}
}