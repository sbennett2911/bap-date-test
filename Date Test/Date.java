/***********************************************************************
 Program Name: DateTest.java
 Programmer's Name: Steven Bennett
 Program Description: Program allows user to input month, day, and year
 as integers.  The program will increment the day by one.  Changing
 month and year where appropriate.
 ***********************************************************************/ 

public class Date {
	
	//declare variables
	int month;
	int day;
	int year;
	int maxDay; //holds value for maximum days in a month.
	//array determines maximum number of days in a month. Index 12 holds 29 for February in leap year.
	int[] maxDayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 29};
	
	//constructors
	public Date(){
		month = 0;
		day = 0;
		year = 0;
	}
	
	public Date(int m, int d, int y){
		month = m;
		day = d;
		year = y;
	}
	
	public boolean isLeapYear(int y){
		return (y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0));
	}
	
	public int getDay(){
		return day;
	}
	
	public int nextDay(int d){
		return day = d + 1;
	}
}
