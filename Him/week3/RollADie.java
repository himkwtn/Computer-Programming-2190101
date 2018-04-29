import java.lang.Math;
public class RollADie {
	public static void main(String[] args) {
		int[] num = new int[6];
		int dice;
		for(int i = 0 ; i < 30 ; i++){
			dice = (int)Math.floor(Math.random()*6);

			
			Java101.showDieFace(dice+1);
			num[dice] += 1; 
		}

		for(int j = 0 ; j < 6 ; j++){
			System.out.println((j+1)+":" +num[j]);
		}
		//asd
	}
}