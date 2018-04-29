public class DesaturateItJ{
	public static void main(String [] args){
		int [][][] rgb = Java101ImageUtil.getRGBArrayFromFile();
		if(rgb==null){return;}
		int [][][] gray = desaturate(rgb);
		Java101ImageUtil.showViewer(rgb,gray,"Desaturate It!");
	}
	public static int [][][] desaturate(int [][][] rgb){
		int[][][] gray = new int[rgb.length][rgb[0].length][3];
		for(int x=0;x<rgb.length;x++){
			for(int y=0;y<rgb[0].length;y++){
				int sum = (rgb[x][y][0] + rgb[x][y][1] + rgb[x][y][2])/3;

				gray[x][y][0] = sum;
				gray[x][y][1] = sum;
				gray[x][y][2] = sum;
			}
		}

		return gray;
	}
}
