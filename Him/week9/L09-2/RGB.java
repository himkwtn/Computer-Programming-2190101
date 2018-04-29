import java.util.Scanner;
public class RGB{
	public static void main(String[] args) {
		int w ,h ;
		Scanner kb = new Scanner(System.in);
		System.out.print("enter width ");
		w = kb.nextInt();
		System.out.print("\nenter heigt ");
		h = kb.nextInt();
		double slope = (double) h / w * 2;
		int[][][] color = new int[w][h][3];
		for(int i = 0 ; i < w ; i++){
			for (int j = 0 ; j < h ; j++ ) {
				if( j < h-(i*slope) || j < (i*slope)-h){
					color[i][j][0] = 0;
					color[i][j][1] = 255;
					color[i][j][2] = 255;

				}
				else {
					color[i][j][0] = 0;
					color[i][j][1] = 155;
					color[i][j][2] = 155;
				}
			}
		}
		Java101ImageUtil.showViewer(color,"Triangle");
	}
}