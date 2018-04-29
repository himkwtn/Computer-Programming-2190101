import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
	static int exitCode = 0;
	public static boolean checkUser(String user) {
		Pattern p = Pattern.compile("^[a-zA-Z]{1}[^\\ \\\\]{3,255}");
		Matcher m = p.matcher(user);
		if ( m.find() )
			if ( m.group(0).length() == user.length() && !m.group(0).contains("..") )
					return true;
		return false;
	}
	public static boolean checkPwd(String user, String pwd) {
		String pattern;
		if ( !pwd.toLowerCase().contains(user.toLowerCase())) {
			 if ( pwd.length() < 8 ) pattern = "^(?=.*[!@#$%])(?=(.*?\\d){2})[^\\*\\ \\\\]{3,8}" ;
			 else pattern = "^[^\\*\\ \\\\]{8,255}";
			 Pattern p = Pattern.compile(pattern);
			 Matcher m = p.matcher(pwd);
			 if ( m.find() )
				if ( m.group(0).length() == pwd.length() ) return true;
		}	
		return false;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("Enter username: ");
			String user = s.nextLine();
			if ( !checkUser(user) ) throw new Exception("Invalid Username");
			System.out.print("Enter password: ");
			String pwd = s.nextLine();
			if ( !checkPwd(user,pwd) ) throw new Exception("Invalid Password");
			System.out.print("Please re-enter password: ");
			String pwdCheck = s.nextLine();
			if ( !pwd.equals(pwdCheck)) throw new Exception("Password don't match");
			else System.out.println("Account has been created !");
		} catch (Exception e) {
			exitCode = 1;
			System.out.println(e.getMessage());
		} finally {
			s.close();
			System.exit(exitCode);
		}
	}
}
