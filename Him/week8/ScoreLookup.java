import java.util.Scanner;
import java.io.*;
public class ScoreLookup{
	public static void main(String [] args) throws IOException{
		String lookupString = constructLookUpStringFromFile("score.csv");
		boolean toQuit = false;
		do{
			char choice = showMainMenu();
			switch (choice){
				case 'L':
					commenceLookUpProcedure(lookupString);
					break;
				case 'Q':
					toQuit = true;
					break;
				default:
					System.out.println("Invalid choice. Quitting.");
					toQuit = true;
			}
		}while(!toQuit);
	}

	public static String constructLookUpStringFromFile(String file) throws IOException{
		String str = "";
		Scanner sc = new Scanner(new File(file));
		sc.nextLine();
		while(sc.hasNext()){
			str += sc.next() + ",";
		}
		return str;
	}

	public static char showMainMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println("Main Menu");
		System.out.println("-----------------------------------------");
		System.out.println("L) \t Look up score");
		System.out.println("Q) \t Quit");
		System.out.print(">>");
		String choice = sc.next();
		return choice.length() == 1 ? choice.charAt(0) : 'a';
	}

	public static void commenceLookUpProcedure(String score){
		Scanner sc = new Scanner(score).useDelimiter(",");
		System.out.print("Enter student ID: ");
		Scanner kb = new Scanner(System.in);
		String input = kb.nextLine();
		boolean found = false;
		int total = 0;
		while(sc.hasNext()){
			String id = sc.next();
			if(id.equals(input)){
				printScore(id, sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
				found = true;
				break;
			}
		}
		if(!found)
			System.out.println("ID not found");
	}
	public static void printScore(String id, String q1, String q2, String q3, String q4, String q5){
		System.out.println("\t\tQ1\tQ2\tQ3\tQ4\tQ5\tTotal");
		int total = Integer.parseInt(q1) + Integer.parseInt(q2) + Integer.parseInt(q3) + Integer.parseInt(q4) + Integer.parseInt(q5);
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%d\n",id,q1,q2,q3,q4,q5,total); 
	}
}