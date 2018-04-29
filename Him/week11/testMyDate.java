public class testMyDate{
	public static void main(String[] args){
		MyDate d1 = new MyDate(2012, 2, 28);
		System.out.println(d1);             // Tuesday 28 Feb 2012
		System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
		System.out.println(d1.nextMonth()); // Thursday 1 Mar 2012 – must be "Day 1st"
		System.out.println(d1.nextYear());  // Tuesday 1 Jan 2013 – must be "Jan 1"
		
		MyDate d2 = new MyDate(2012, 1, 2);
		System.out.println(d2);                 // Monday 2 Jan 2012
		System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
		System.out.println(d2.previousMonth()); // Thursday 1 Dec 2011
		System.out.println(d2.previousYear());  // Saturday 1 Jan 2011
		
		MyDate d3 = new MyDate(2012, 2, 29);
		System.out.println(d3.previousYear());  // Saturday 1 Jan 2011
		
		MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
		MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!

		System.out.println(d4);
		System.out.println(d5);
		
		MyDate g1 = new MyDate(2012, 1, 1); // Saturday 31 Dec 2011
		MyDate g2 = new MyDate(2012, 2, 1); // Tuesday 31 Jan 2012
		MyDate g3 = new MyDate(2012, 3, 1); // Wednesday 29 Feb 2012
		MyDate g4 = new MyDate(2011, 3, 1); // Monday 28 Feb 2011
		System.out.println(g1.previousDay()); System.out.println(g2.previousDay()); System.out.println(g3.previousDay()); System.out.println(g4.previousDay());
		
		MyDate c1 = new MyDate(2011, 2, 28); // Tuesday 1 Mar 2011
		MyDate c2 = new MyDate(2012, 10, 31); // Thursday 1 Nov 2012
		MyDate c3 = new MyDate(2012, 11, 30); // Saturday 1 Dec 2012
		MyDate c4 = new MyDate(2012, 12, 31); // Tuesday 1 Jan 2013
		System.out.println(c1.nextDay()); System.out.println(c2.nextDay()); System.out.println(c3.nextDay()); System.out.println(c4.nextDay());
	}
}