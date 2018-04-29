import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
public class ScoreSortList{
	
	public static void main(String [] args) throws IOException {
		List <StudentScore> scores = readScoreFile();
		sortByTotal(scores);
		listTop(scores, 20);
	}

	public static List<StudentScore> readScoreFile() throws IOException {
		Scanner sc = new Scanner(new File("Score.csv"));
		List<StudentScore> scores = new ArrayList<>();
		sc.nextLine();
		while(sc.hasNext())
			scores.add(new StudentScore(sc.nextLine()));
		return scores;
	}

	public static void sortByTotal(List<StudentScore> data){
		data.sort( (s1,s2) -> s2.getTotalScore() - s1.getTotalScore() );
	}

	public static void listTop( List<StudentScore> sortedScores , int n){
		sortedScores.get(0).printScore(true);
		for(int i = 1 ; i < n ; i++)
			sortedScores.get(i).printScore(false);
	}

}