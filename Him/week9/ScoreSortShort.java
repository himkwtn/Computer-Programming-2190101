import java.util.*;
import java.io.*;
public class ScoreSortShort{

	public static void main(String [] args){
		StudentScore [] scores = readScoreFile();
		sortByTotal(scores);
		listTop(scores, 20);
	}

	public static StudentScore [] readScoreFile(){
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

	public static void sortByTotal(StudentScore [] data){
		Arrays.sort(data, (s1,s2) -> s2.getTotalScore() - s1.getTotalScore());
	}

	public static void listTop(StudentScore[] sortedScores, int n){
		sortedScores[0].printScore(true);
		for(int i = 1 ; i < n ; i++)
			sortedScores[i].printScore(false);
	}

}