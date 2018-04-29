public class MyDate{
    private int year;
    private int month;
    private int day;
    private static String[] strMonths = new String[] { 
        "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    private static String[] strDays = new String[] {
        "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    private static int[] daysInMonths = new int[] {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public boolean isLeapYear(int year){
        return  ( ( year % 4 == 0 && year % 100 != 0) || year % 400 == 0 );
    }
    public boolean isValidDate (int year, int month, int day){
        if( year < 1 || year > 9999 || month < 1 || month > 12)
            return false;
        return ( day <= (month==2&&isLeapYear(year)?29:daysInMonths[month-1]) ) && day > 0;
    }
    public int getDayOfWeek(int day, int month, int year) {
		int dow = 0;
		int[] centuryIndex = { 6, 4, 2, 0 };
		int[] nonLeapYearMonthIndex = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		int[] leapYearMonthIndex = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };

		int year1 = (int) Math.floor(year / 100.0);
		int year2 = year % 100;
		int centuryNum = centuryIndex[(year1 % 4)];

		int monthNum = nonLeapYearMonthIndex[month-1];
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			monthNum = leapYearMonthIndex[month-1];
		}

		dow = (centuryNum + year2 + (int) Math.floor(year2 / 4) + monthNum + day) % 7;
		return dow;
    }
    public String toString(){
        if(isValidDate(year,month,day))
            return strDays[getDayOfWeek(day,month,year)]+" "+day+" "+strMonths[month-1]+" "+year;
        return "Invalid year, month, or day!";
    }
    public MyDate nextDay(){
        if( day ==  (month==2&&isLeapYear(year)?29:daysInMonths[month-1]) ){
            if(month == 12)
                return new MyDate(year+1,1,1);
            return new MyDate(year,month+1,1);
        }
        return new MyDate(year,month,day+1);        
    }
    public MyDate previousDay(){
        if(day == 1){
            if(month == 1 )
                return new MyDate(year-1,12,31);
            else if(month == 3 && isLeapYear(year))
                return new MyDate(year,2,29);
            return new MyDate(year,month-1,daysInMonths[month-2]);
        }
        return new MyDate(year,month,day-1);
    }
    public MyDate nextMonth(){
        return month == 12 ? new MyDate(year+1,1,1) : new MyDate(year,month+1,1);
    }
    public MyDate previousMonth(){
        return month == 1 ?  new MyDate(year-1,12,1) : new MyDate(year,month-1,1);
    }
    public MyDate nextYear(){
        return new MyDate(year+1,1,1);
    }
    public MyDate previousYear(){
        return new MyDate(year-1,1,1);
    }
}