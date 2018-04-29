import java.util.Scanner;
public class PointTest1{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter x1 coordinate: ");
		double x1 = sc.nextDouble();
		System.out.println("Please enter y1 coordinate: ");
		double y1 = sc.nextDouble();

		System.out.println("Please enter x2 coordinate: ");
		double x2 = sc.nextDouble();
		System.out.println("Please enter y2 coordinate: ");
		double y2 = sc.nextDouble();

		sc.close();

		Point point1 = new Point(x1,y1);
		Point point2 = new Point(x2,y2);

		double dis = point1.distance(point2);
		System.out.println("Distace between the two points is "+dis);
	} 
}