import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class bufferTest{
	public static void main(String[] args) {
		
		try{
			FileReader fr = new FileReader("C:/Java work/week5/ocation.txt");
			BufferedReader br = new BufferedReader(fr);
			String line1 = br.readLine();
			String line2 = br.readLine();
			double num1 = Double.parseDouble(line1);
			double num2 = Double.parseDouble(line2);
			Point startPoint = new Point(num1,num2);
			double dis = startPoint.distance(Point.origin);
			System.out.println("Distance between the two points is " + dis);

		}
		catch (IOException e) {
			System.out.print("error oofo");
		}

		
		
			
	}
}