import java.util.*;
import java.io.*;
public class ScoreLookupMap {
	public static void main(String[] args) throws IOException {
		HashMap<String, List<Integer>> student = new HashMap<>();
		setUp(student, "score.csv");
		boolean toQuit = false;
		do{
			char choice = showMainMenu();	
			switch (choice){
				case 'L':
					commenceLookUpProcedure(student);
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

	public static void setUp(HashMap<String, List<Integer>> student, String file)throws IOException{
		Scanner sc = new Scanner(new File(file));
		sc.nextLine();
		List<Integer> scores = new ArrayList<>();
		while(sc.hasNext()){
			String[] line = sc.nextLine().split(",");
			for(int i = 1 ; i < line.length ; i++)
				scores.add(Integer.parseInt(line[i]));
			student.put(line[0], new ArrayList<Integer>(scores));
			scores.clear();
		}
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

	public static void commenceLookUpProcedure(HashMap<String, List<Integer>> student){
		System.out.print("Enter student ID: ");
		Scanner kb = new Scanner(System.in);
		String id = kb.nextLine();
		if(student.containsKey(id))
			printScore(id, student.get(id));
		else
			System.out.println("ID not found");		
	}
	public static void printScore(String id, List<Integer> scores){
		int total = 0;
		System.out.println("\t\tQ1\tQ2\tQ3\tQ4\tQ5\tTotal");
		System.out.print(id+"\t");
		for(int n : scores){
			total += n;
			System.out.print(n+"\t");
		}
		System.out.print(total+"\n");
	}
}