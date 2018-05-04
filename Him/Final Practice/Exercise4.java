import java.util.*;
public class Exercise2{
	public static void main(String[] args) {
		System.out.print(Arrays.toString(findDifference(new int[]{1,4,5,7},new int[]{1,7,8,3})));
		System.out.print(Arrays.toString(findDifference(new int[] {1,7,8,3},new int[]{1,4,5,7})));
	}
	public static int[] findDifference(int[] a, int[] b){
		for(int i = 0; i < a.length ; i++) {
			for(int j = 0 ; j < b.length ; j++) {
				if(a[i] == b[j]) {
					a[i] = 0;
				}
			}
		}
		return Arrays.stream(a).filter( n ->  n != 0).toArray();

	}
	public static int[] findDifferenceLoop(int[] a, int[] b){
		int counter = a.length;
		for(int i = 0; i < a.length ; i++) {
			for(int j = 0 ; j < b.length ; j++) {
				if(a[i] == b[j]) {
					a[i] = 0;
					counter--;
				}
			}
		}
		int[] res = new int[counter];
		int j = 0;
		for(int i  = 0; i < a.length ; i++) {
			if((a[i]!=0)) {
				res[j] = a[i];
				j++;
			}
		}
		return res;
	}
}