package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the year.");
		int year = in.nextInt();
		boolean leapYear = (((year%(4) < 1) && (year%(100) > 0))|| (year % 400 < 1));
		System.out.print(year + " is a leap year: " + leapYear);
	}

}
