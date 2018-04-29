import java.util.*;

public class Triangle{
	public static void main(String[] args){

	
	System.out.println("Please input the width and height");
	Scanner s1=new Scanner(System.in);
	int w=s1.nextInt();
	int h=s1.nextInt();
	
	int [][][] rgb = genPic(w,h);

	Java101ImageUtil.showViewer(rgb,"Triangle");


	}

	public static int [][][] genPic(int w,int h){
		int [][][] rgb = new int[w][h][3];
		double slope=((2.0*h)/w);



		for(int i=0;i<w;i++){
			for(int j=0;j<h;j++){

				if (j>slope*i-h&&j>-slope*i+h)
					{
					rgb[i][j][0]=255;
					rgb[i][j][1]=255;
					rgb[i][j][2]=255;
					}
				else
					{
					rgb[i][j][0] = 255;
					rgb[i][j][1]= 168;
					rgb[i][j][2]=255;
					}

			}
		}

		

		return rgb;
	}
}
