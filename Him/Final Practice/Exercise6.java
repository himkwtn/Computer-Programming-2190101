import java.util.*;
public class Exercise6{
	public static void main(String[] args) {
		int[][] table = new int[10][10];
		for(int row = 0 ; row < table.length ; row++){
			for(int col = 0 ; col < table[0].length ; col++){
				table[row][col] = (int)Math.floor(Math.random()*6);
			}
		}
		System.out.println(findHighestSummationWindow(table));

	}
	public static int findHighestSummationWindow(int[][] table) {
		Arrays.stream(table).forEach(row -> System.out.println(Arrays.toString(row).replace(",","\t")));
		int max = -100;
		for(int row = 0 ; row < table.length-1 ; row++){
			for(int col = 0 ; col < table[0].length-1 ; col++){
				int twoByTwo = table[row][col]+table[row+1][col]+table[row][col+1]+table[row+1][col+1];
				if(twoByTwo > max){
					max = twoByTwo;
				}
			}
		}
		return max;
	}


}