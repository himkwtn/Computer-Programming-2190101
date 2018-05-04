import java.util.Arrays;
public class Exercise3{
	public static void main(String[] args) {
		permute(new int[] {1,2,3,4});
	}
	public static void permute(int[] arr){
		permute(arr,0,arr.length);
	}
	public static void permute(int[] arr, int n, int l){
		if(n == l){
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i = n ; i < l ; i++){
			permute(arr,n+1,l);
			swap(arr,n,i);
		}
	}
	public static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}