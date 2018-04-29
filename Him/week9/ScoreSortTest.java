import java.util.*;
import java.io.*;
public class ScoreSortTest{
	public static void main(String[] args) {
		ArrayList<StudentScore> student = new ArrayList<StudentScore> ();
		student.add(new StudentScore("5630000021,10,10,9,8,7"));
		student.add(new StudentScore("5630000121,8,8,10,6,5"));
		student.add(new StudentScore("5630500121,8,6,10,8,5"));	
		student.get(0).printScore(true);
	}
}