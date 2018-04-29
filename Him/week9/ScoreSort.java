import java.util.*;
import java.io.*;
public class ScoreSort{

	public static void main(String [] args){
		StudentScore [] scores = readScoreFile();
		sortByTotal(scores);
		listTop(scores, 30);
	}

	public static StudentScore [] readScoreFile(){
		// List <StudentScore> list = new ArrayList<>();
		// try{
		// 	Scanner sc = new Scanner(new File("score.csv"));
		// 	sc.nextLine();
		// 	while(sc.hasNextLine())
		// 		list.add(new StudentScore(sc.nextLine()));
		// }
		// catch (IOException e) {
		// 	e.printStackTrace();
		// }
		// return list.toArray( new StudentScore[list.size()] );
		StudentScore[] scores = new StudentScore[1000];
		try{
			Scanner sc = new Scanner(new File("score.csv"));
			sc.nextLine();
			int i = 0;
			while(sc.hasNextLine()) {
				scores[i] = new StudentScore(sc.nextLine());
				i++;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return scores;
	}

	public static void sortByTotal(StudentScore [] data){
		//Arrays.sort(data, (s1,s2) -> s2.getTotalScore() - s1.getTotalScore());
		boolean check = true;
		StudentScore temp;
		while(check){
			check = false;
			for(int i = 0 ; i < data.length - 1 ; i++){
				if(data[i+1].getTotalScore() > data[i].getTotalScore()){
					temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
					check = true;
				}
			}
		}
	}

	public static void listTop(StudentScore[] sortedScores, int n){
		sortedScores[0].printScore(true);
		for(int i = 1 ; i < n ; i++)
			sortedScores[i].printScore(false);
	}

}