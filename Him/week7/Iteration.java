import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Iteration{
	public static void main(String[] args)  throws FileNotFoundException{
		Scanner sc1 = new Scanner( new File ("score.csv"));
		sc1.nextLine();
		
		int q1max=0;
		int q2max=0;
		int q3max=0;
		int q4max=0;
		int q5max=0;
		int q1min=10;
		int q2min=10;
		int q3min=10;
		int q4min=10;
		int q5min=10;
		int maxt = 0;
		int mint = 0;
		int line = 0;
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double sum4 = 0;
		double sum5 = 0;

		while(sc1.hasNextLine()){
			String str = sc1.nextLine();
			Scanner sc2 = new Scanner(str).useDelimiter(",");
			sc2.next();
			int q1 = Integer.parseInt(sc2.next());
			int q2 = Integer.parseInt(sc2.next());
			int q3 = Integer.parseInt(sc2.next());
			int q4 = Integer.parseInt(sc2.next());
			int q5 = Integer.parseInt(sc2.next());
			sum1+=q1;
			sum2+=q2;
			sum3+=q3;
			sum4+=q4;
			sum5+=q5;
			if(q1 > q1max) q1max = q1;
			if(q2 > q2max) q2max = q2;
			if(q3 > q3max) q3max = q3;
			if(q4 > q4max) q4max = q4;
			if(q5 > q5max) q5max = q5;
			if(q1 < q1min) q1min = q1;
			if(q2 < q2min) q2min = q2;
			if(q3 < q3min) q3min = q3;
			if(q4 < q4min) q4min = q4;
			if(q5 < q5min) q5min = q5;
			line++;
		}

		double avg1 = sum1/line;
		double avg2 = sum2/line;
		double avg3 = sum3/line;
		double avg4 = sum4/line;
		double avg5 = sum5/line;
		double avgt = (sum1+sum2+sum3+sum4+sum5)/(5*line);
		maxt = q1max>maxt?q1max:maxt;
		maxt = q2max>maxt?q2max:maxt;
		maxt = q3max>maxt?q3max:maxt;
		maxt = q4max>maxt?q4max:maxt;
		maxt = q5max>maxt?q5max:maxt;
		mint = q1min<mint?q1min:mint;
		mint = q2min<mint?q2min:mint;
		mint = q3min<mint?q3min:mint;
		mint = q4min<mint?q4min:mint;
		mint = q5min<mint?q5min:mint;
		sc1.close();

		double sd1 = 0;
		double sd2 = 0;
		double sd3 = 0;
		double sd4 = 0;
		double sd5 = 0;
		double sdt = 0;
		Scanner sc3 = new Scanner( new File ("score.csv"));
		sc3.nextLine();

		while(sc3.hasNextLine()){
			String str = sc3.next();
			Scanner sc2 = new Scanner(str).useDelimiter(",");
			sc2.next();
			int q1 = Integer.parseInt(sc2.next());
			int q2 = Integer.parseInt(sc2.next());
			int q3 = Integer.parseInt(sc2.next());
			int q4 = Integer.parseInt(sc2.next());
			int q5 = Integer.parseInt(sc2.next());
			sd1 += Math.pow(q1-avg1,2);
			sd2 += Math.pow(q2-avg2,2);
			sd3 += Math.pow(q3-avg3,2);
			sd4 += Math.pow(q4-avg4,2);
			sd5 += Math.pow(q5-avg5,2);
			sdt += Math.pow(q1-avgt,2)+Math.pow(q2-avgt,2)+Math.pow(q3-avgt,2)+Math.pow(q4-avgt,2)+Math.pow(q5-avgt,2);
		}

		sd1 = Math.sqrt(sd1/(line-1));
		sd2 = Math.sqrt(sd2/(line-1));
		sd3 = Math.sqrt(sd3/(line-1));
		sd4 = Math.sqrt(sd4/(line-1));
		sd5 = Math.sqrt(sd5/(line-1));
		sdt = Math.sqrt(sdt/((5*line)-1));
		sc3.close();
		System.out.println("max = " + q1max + ", "  + q2max + ", "  + q3max + ", " + q4max + ", " + q5max + ", " + maxt);
		System.out.println("min = " + q1min + ", "  + q2min + ", "  + q3min + ", " + q4min + ", " + q5min + ", " + mint);
		System.out.println("average = " + avg1 + ", " + avg2 + ", " + avg3 + ", " + avg4 + ", " + avg5 + ", " + avgt);
		System.out.println("sd(population) = " + sd1 + ", "  + sd2 + ", "  + sd3 + ", " + sd4 + ", "  + sd5 + ", " + sdt);

	}
}

