import java.util.*;
import java.io.*;
public class ScoreLookupArray {
	public static ArrayList<String> data = new ArrayList<>();
	public static void main(String [] args) throws IOException {
		setUp("score.csv");	
		boolean toQuit = false;
		do{
			char choice = showMainMenu();	
			switch (choice){
				case 'L':
					commenceLookUpProcedure();
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

	public static void setUp(String file) throws IOException{
		Scanner sc = new Scanner(new File(file));
		sc.nextLine();
		while(sc.hasNextLine())
			data.add(sc.nextLine());
	}

	public static char showMainMenu(){
		Scanner kb = new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println("Main Menu");
		System.out.println("-----------------------------------------");
		System.out.println("L) \t Look up score");
		System.out.println("Q) \t Quit");
		System.out.print(">>");
		String choice = kb.next();
		return (choice.length()==1)?choice.charAt(0):'a';
	}

	public static void commenceLookUpProcedure(){
		System.out.print("Enter student ID: ");
		Scanner kb = new Scanner(System.in);
		String id = kb.nextLine();
		String[] line;
		boolean found = false;
		for(String str : data){
			line = str.split(",");
			if(line[0].equals(id)) {
				found = true;
				printScore(line);
				break;
			}
		}
		if(!found)
			System.out.println("Student ID not found.");			
	}

	public static void printScore(String[] student){
		int total = 0;
		System.out.println("\t\tQ1\tQ2\tQ3\tQ4\tQ5\tTotal");
		for(int i = 1 ; i < student.length ; i++) 
			total += Integer.parseInt(student[i]);
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%d\n",student[0],student[1],student[2],student[3],student[4],student[5],total);
	}
}