import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class PointTest2{
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("C:/Java work/week5/location2.txt");
			BufferedReader br = new BufferedReader(fr);
			double num1 = Double.parseDouble(br.readLine());
			double num2 = Double.parseDouble(br.readLine());
			Point startPoint = new Point(num1,num2);
			double dis = startPoint.distance(Point.origin);
			System.out.println("Distance between the two points is " + dis);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
            e.printStackTrace();
        }		
	}
}