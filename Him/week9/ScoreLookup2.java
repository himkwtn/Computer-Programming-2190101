import java.util.*;
import java.io.*;
public class ScoreLookup2 {
	public static void main(String [] args) {
		StudentScore[] StudentScore = readScoreFile();
		boolean toQuit = false;
		do{
			toQuit = false;
			String choice = getStudentID();	
			if(choice.equals("quit"))
				toQuit = true;
			else
				showScoreOf(StudentScore, choice);			
		}while(!toQuit);
	}

	public static StudentScore[] readScoreFile() {
		List <StudentScore> list = new ArrayList<>();
		try{
			Scanner sc = new Scanner(new File("score.csv"));
			sc.nextLine();
			while(sc.hasNextLine()) 
				list.add(new StudentScore(sc.nextLine()));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return list.toArray( new StudentScore[list.size()] );
	}

	public static String getStudentID() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Student ID\n>> ");
		return kb.next();
	}

	public static void showScoreOf(StudentScore[] data, String id) {
		for(StudentScore student : data)
			if(student.id.equals(id)){
				student.printScore(true);
				return;
			}
		System.out.println("Student ID not found.");			
	}
}