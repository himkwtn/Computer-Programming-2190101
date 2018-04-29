import java.util.Scanner;
public class opAF {
	
	public static boolean twoNum(String id) {
		int len = id.length();
		int count = 0;

		for(int i = 0 ; i < len ; i++){
			char c = id.charAt(i);
			if(Character.isDigit(c)){
				count ++;
			}
		}
		
		if (count>=2){
			return true;
		}
		
		else{
			return false;
		}
	}

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		String username;
		String password;

		while(true) {

			System.out.println("Please create your username :");
			username = sc.nextLine();
			boolean backSlash = username.contains("\\");
			int len = username.length();
			boolean dbleDot = username.contains("..");
			boolean space = username.contains(" ");
	
			if(len >= 4 && len <= 255) {
		
				if( (username.charAt(0) >= 'a' && username.charAt(0) <= 'z') || (username.charAt(0) >= 'A' && username.charAt(0) <= 'Z') ) {

					if(!space){

						if(!backSlash){
	
							if(!dbleDot){

								System.out.println("Good.");
								break;
							}
						}	
					}		
				}
			}
			System.out.println("Invalid username");
			System.exit(0);
			
		}

		while(true) {
			
			System.out.println("Please create your password");
			password = sc.nextLine();
			int passlen = password.length();
			boolean atUser = password.toLowerCase().contains(username.toLowerCase());
			boolean asterisk = password.contains("*");
			boolean backSlash2 = password.contains("\\");
			boolean space2 = password.contains(" ");

	

			if (passlen >= 4 && passlen <= 255){

				if(!atUser){

					if(!asterisk){

						if(!backSlash2){

							if(!space2){

								if (passlen <= 8  ){

									if(password.contains("!")||password.contains("@")||password.contains("#")||password.contains("$")||password.contains("%")) {

										if(twoNum(password)){

											System.out.println("Good");
											break;
										}
									}
								}
								else { 
							
									System.out.println("Good");
									break;
								}
							}
						}
					}
				}
			}
			System.out.println("Invalid password");
			System.exit(0);
		}

		System.out.println("Please re-enter your password.");
		String password2 = sc.nextLine();

		if (password2.equals(password) == false) {
			System.out.println("Wrong");
			System.exit(0);
		}

		System.out.println("Finish!");
	
	}
}