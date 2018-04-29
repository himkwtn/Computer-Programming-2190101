import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PointTest2Scanner{
	public static void main(String[] args) {
		try{
			File file = new File("C:/Java work/week5/location2.txt");
			Scanner sc = new Scanner(file);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			Point startPoint = new Point(num1,num2);
			double dis = startPoint.distance(startPoint.origin);
			System.out.println("Distance between the two points is " + dis);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}			
	}
}