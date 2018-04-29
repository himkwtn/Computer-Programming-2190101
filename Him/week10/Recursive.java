import java.util.Scanner;
import java.math.BigDecimal;
public class Recursive{
	public static long num = 0,num2 = 0;
	public static void main(String[] args) {
		while(true){
			Scanner kb = new Scanner(System.in);;
			System.out.print("enter a number: ");
			int n = kb.nextInt(); num = 0; num2 = 0;
			System.out.println("f("+n+") = " + computeF(n)+", function called: "+num+" times");
			if(n <30 )
				System.out.println("f2("+n+") = " + f2(n)+", function called: "+num2+" times");
		}
	}
	public static BigDecimal computeF(int n ){
		BigDecimal [] sum = new BigDecimal[n+1];
		return computeF(n,sum);
	}
	public static BigDecimal computeF(int n , BigDecimal[] sum){
		num++;
		if(sum[n] != null)
			return sum[n];
		else if (n > 2)
			return sum[n] = computeF(n-1,sum).add(computeF(n-2,sum)).add(computeF(n-3,sum));
		else{
			return sum[n] = new BigDecimal(1);
		}
	}
	public static long f2(int n){
		num2++;
		if(n <= 2){
			return 1;
		}
		return f2(n-1)+f2(n-2)+f2(n-3);
	}
}