
public class Lab102 {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	private final void set(int dMonth, int dDay, int dYear) {
	}
	public final int getdMonth() {
		return this.dMonth;
	}
	public final int getdDay() {
		return this.dDay;
	}
	public final int getdYear() {
		return this.dYear;
	}
	public final void printLab102() {
		System.out.println("the month is: " +this.dMonth+ " the day is: "+ this.dDay+ " the year is: "+ this.dYear);
}
	public Lab102(int dMonth, int dDay, int dYear) {
	this.dMonth = 11;
	this.dDay = 10;
	this.dYear = 2022;
	}
		
	
	
}
