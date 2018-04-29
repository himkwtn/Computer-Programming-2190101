import java.util.*;
public class DesaturateIt{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter desaturation(0-1): ");
		double intensity = kb.nextDouble();
		int [][][] rgb = Java101ImageUtil.getRGBArrayFromFile();
		if(rgb==null){return;}
		int [][][] gray = desaturate(rgb,intensity);
		Java101ImageUtil.showViewer(rgb,gray,"Desaturate It!");
	}
	public static int [][][] desaturate(int [][][] rgb, double k){
		int w = rgb.length;
		int h = rgb[0].length;
		int[][][] desat = new int[w][h][3];
		for(int i = 0 ; i < w ; i++){
			for(int j = 0 ; j < h ; j++){
				double in = rgb[i][j][0]*0.299 + rgb[i][j][1]*0.587 + rgb[i][j][2]*0.114;
				desat[i][j][0] = (int)(k*in + rgb[i][j][0]*(1-k)); 
				desat[i][j][1] = (int)(k*in + rgb[i][j][1]*(1-k)); 
				desat[i][j][2] = (int)(k*in + rgb[i][j][2]*(1-k)); 
			}
		}
		return desat;
	}
}