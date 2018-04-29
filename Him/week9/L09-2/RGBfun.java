import java.util.Scanner;
public class RGBFun{
	public static void main(String[] args) {
		int w ,h ;
		Scanner kb = new Scanner(System.in);
		System.out.print("enter width ");
		w = kb.nextInt();
		System.out.print("\nenter heigt ");
		h = kb.nextInt();
		// double slope = (double) h / w * 2;
		// int[][][] color = new int[w][h][3];
		// for(int i = 0 ; i < w ; i++){
		// 	for (int j = 0 ; j < h ; j++ ) {
		// 		if( j < h-(i*slope) || j < (i*slope)-h){
		// 			color[i][j][0] = 0;
		// 			color[i][j][1] = 255;
		// 			color[i][j][2] = 255;

		// 		}
		// 		else {
		// 			color[i][j][0] = 0;
		// 			color[i][j][1] = 155;
		// 			color[i][j][2] = 155;
		// 		}
		// 	}
		// }
		double slope = (double) h / w ;
		int[][][] color = new int[w][h][3];
		// for(int i = 0 ; i < w ; i++){
		// 	for (int j = 0 ; j < h ; j++ ) {
		// 		//cyan
		// 		if( j < (h/2)-(i*slope)){
		// 			color[i][j][0] = 0;
		// 			color[i][j][1] = 255;
		// 			color[i][j][2] = 255;

		// 		}
		// 		//orange
		// 		if(j > (i*slope)-(h/2) && (i > w/2) && ( j < h/2) ){
		// 			color[i][j][0] = 255;
		// 			color[i][j][1] = 204;
		// 			color[i][j][2] = 0;
		// 		}
		// 		//green
		// 		if(j < (i*slope)+(h/2) && ( i < w/2) && (j > h/2) ){
		// 			color[i][j][0] = 0;
		// 			color[i][j][1] = 255;
		// 			color[i][j][2] = 0;
		// 		}
		// 		//blue
		// 		if (j > -(i*slope)+(3*h/2) ){
		// 			color[i][j][0] = 55;
		// 			color[i][j][1] = 155;
		// 			color[i][j][2] = 155;
		// 		}
		// 	}
		// }
		// for(int i = 0 ; i < w ; i++){
		// 	for (int j = 0 ; j < h ; j++ ) {
		// 		//cyan
		// 		if( j < i*slope && ( j > h/2 ) && (i > w/2) ){
		// 			color[i][j][0] = 0;
		// 			color[i][j][1] = 255;
		// 			color[i][j][2] = 255;
		// 		}
		// 		//orange
		// 		if(j > i*slope && ( j < h/2) && (i < w/2)){
		// 			color[i][j][0] = 255;
		// 			color[i][j][1] = 204;
		// 			color[i][j][2] = 0;
		// 		}
		// 		//green
		// 		if( j < h - i*slope  && (j < h/2) && (i > w/2)){
		// 			color[i][j][0] = 0;
		// 			color[i][j][1] = 255;
		// 			color[i][j][2] = 0;
		// 		}
		// 		if( j > h - i*slope  && (j > h/2) && (i < w/2)){
		// 			color[i][j][0] = 0;
		// 			color[i][j][1] = 255;
		// 			color[i][j][2] = 0;
		// 		}

		// 	}
		// }
		for(int i = 0 ; i < w ; i++){
			for (int j = 0 ; j < h ; j++ ) {
				// if( ( Math.pow(( (double) j - (h/2))/ (h/2) ,2) ) + ( Math.pow(( (double) i - (w/2))/ (w/2) ,2) ) < 1  ){
				// 	color[i][j][0] = 0;
				// 	color[i][j][1] = 255;
				// 	color[i][j][2] = 255;
				// }
				//cyan
				if( Math.pow( (double) j  , 2 )  +   Math.pow( (double) i - w/2  , 2  ) < w*w/4   && i > w/2){
					color[i][j][0] = 0;
					color[i][j][1] = 255;
					color[i][j][2] = 255;
				}
				//orange
				if( Math.pow( (double) j  - h/2 , 2 )  +   Math.pow( (double) i   , 2  ) < w*w/4 && j < h/2){
					color[i][j][0] = 255;
					color[i][j][1] = 204;
					color[i][j][2] = 0;
				}
				//green
				if( Math.pow( (double) j  - h , 2 )  +   Math.pow( (double) i - w/2  , 2  ) < w*w/4 && i < w/2){
					color[i][j][0] = 0;
					color[i][j][1] = 255;
					color[i][j][2] = 0;
				}

				if( Math.pow( (double) j  - h/2 , 2 )  +   Math.pow( (double) i - w  , 2  ) < w*w/4 && j > h/2){
					color[i][j][0] = 100;
					color[i][j][1] = 255;
					color[i][j][2] = 100;
				}

			}
		}
		// for(int i = 0 ; i < w ; i++){
		// 	for (int j = 0 ; j < h ; j++ ) {
		// 		//cyan
		// 		if(  j < Math.exp(0.1*i)  ){
		// 			color[i][j][0] = 0;
		// 			color[i][j][1] = 255;
		// 			color[i][j][2] = 255;
		// 		}

		// 	}
		// }
		Java101ImageUtil.showViewer(color,"Pondspective");
	}
}