package studio1;

import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number one");
		int n1 = in.nextInt();
		System.out.print("Enter number two");
		int n2 = in.nextInt();
		System.out.print("The average of " + n1 + " and " + n2 + " is " + ((n1 + n2) / 2.0));
				

	}

}
