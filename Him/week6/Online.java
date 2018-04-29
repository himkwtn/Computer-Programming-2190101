import java.util.Scanner;


public class Online	
	{
	public static boolean twoNum( String id)
		{
		int len = id.length();
		int count = 0;

		for(int i = 0 ; i < len ; i++)
			{
			char c = id.charAt(i);
			if(Character.isDigit(c))
				{
				count ++;
				}
			}
		if (count>=2)
			{
			return true;
			}
		else
			{
			return false;
			}
		}


	public static void main(String [] args)
		{

		Scanner s1=new Scanner(System.in);
		String username;
		String pass;

		while (true)
			{
			System.out.print("Please enter a username : ");
			username=s1.nextLine();

			char check=username.charAt(0);

			
			if (username.length()>3 && username.length()<255)
				{
				if(Character.isLetter(username.charAt(0)))
					{
					if(username.contains(" ")==false)
						{
						if(username.contains("\\")==false)
							{
							if(username.contains("..") == false)
								{
								break;
								}
							}
						}
					}
				}

			System.out.println("Please enter a valid username ");
			System.exit(0);
			}

		while (true)
			{
			System.out.println("Hello "+username+" Please enter your password ");
			pass=s1.nextLine();

			char check=pass.charAt(0);

			if (pass.length()<8)
					{
					if(twoNum(pass))
						{
						if(pass.contains("!")||pass.contains("@")||pass.contains("#")||pass.contains("$")||pass.contains("%"))
							{
							break;
							}
						}
					}
				
			else if (pass.length()>3 && pass.length()<255)
				{
				if(pass.contains(" ")==false)
					{
					if(pass.contains("\\")==false)
						{
						if(pass.contains("*")==false)
							{	
							if(username.equalsIgnoreCase(pass)==false)
								{
								break;
								}
							}
						}
					}
				}
			
			System.out.println("Please enter a valid password ");
			System.exit(0);
			}	


		
		System.out.println("Please re-enter your password ");
		String pass2=s1.nextLine();

		if (pass.equals(pass2)==false)
			{
			System.exit(0);
			}

		System.out.println("Username : "+username);
		System.out.println("Password : "+pass);
		}
	}

