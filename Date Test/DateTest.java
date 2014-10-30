/***********************************************************************
 Program Name: DateTest.java
 Programmer's Name: Steven Bennett
 Program Description: Program allows user to input month, day, and year
 as integers.  The program will increment the day by one.  Changing
 month and year where appropriate.
 ***********************************************************************/ 
import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
		
		//create Date object
		Date calendar = new Date();
		int currentDay = 0;
		
		//prompt for user input to set month, day and year
		calendar.month = Integer.parseInt(JOptionPane.showInputDialog("Enter month: "));
		calendar.day = Integer.parseInt(JOptionPane.showInputDialog("Enter day: "));
		calendar.year = Integer.parseInt(JOptionPane.showInputDialog("Enter year: "));
		
		//output initial user input
		System.out.println("User Input: " + calendar.month + "/" + calendar.day + "/" + calendar.year);
		
		for(int i = 0; i < 40; i++){
			
			currentDay = calendar.getDay();
			
			if (calendar.month == 2){
				if (calendar.isLeapYear(calendar.year)){
					calendar.maxDay = calendar.maxDayInMonth[12];
				}
				else{
					calendar.maxDay = calendar.maxDayInMonth[(calendar.month - 1)];
				}
			}
			else{
				calendar.maxDay = calendar.maxDayInMonth[(calendar.month - 1)];
			}//end if that tests if month is February and is a leap year.
			
			if (currentDay < calendar.maxDay){
				calendar.nextDay(currentDay);
				currentDay = calendar.getDay();
			}
			else {
				calendar.day = 1;
				currentDay = 1; //this line is a potential bug.
				if(calendar.month < 12)
					calendar.month++;
				else{
					calendar.month = 1;
					calendar.year++;
				}
					
			}//end if that increments calendar.
			
			System.out.println(calendar.month + "/" + currentDay + "/" + calendar.year);
		}
		
		//terminate program
		System.exit(0);

	}

}
