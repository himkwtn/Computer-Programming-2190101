import java.util.*;
public class Exercise4{
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
		int len = a.length;
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j < b.length ; j++){
				if(a[i] == b[j]){
					len--;
				} 
			}
		}
		int res[] = new int[len];
		int k = 0;
		for(int i = 0 ; i < a.length ; i++){
			boolean dif = true;
			for(int j = 0 ; j < b.length ; j++){
				if(a[i] == b[j]){
					dif = false;
					break;
				} 
			}
			if(dif){
				res[k] = a[i];
				k++;
			}
		}
		return res;
	}
}
