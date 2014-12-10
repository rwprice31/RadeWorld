package radeui;

import java.util.Scanner;

public class RunTime {
	static Scanner MainScan = new Scanner(System.in);

	// creation of main scanner

	public static void main(String[] args) {
		System.out
				.println("Welcome to the game! Type 'New' to make a new game. "
						+ "Type 'Load nameofsave' to load a game. Type 'Save' to save anytime during the game. Type help for list of commands anytime during the game.");
		String s = MainScan.next();

		int score = 0;
		while (score != 50) { // top level of commands and operations.
			if (s.equalsIgnoreCase("new room"))
				System.out.println("First room");
			else if (s.equalsIgnoreCase("Enter:  + knownexit"))
				System.out.println("Load exit");
			else if (s.equalsIgnoreCase("load + knownname"))
				System.out.println("Load knownname");
			else if (s.equalsIgnoreCase("help"))
				System.out.println("HELP:  + Helpdatabase.description");
			else
				System.out.println("Invalid Input. Try again!");
		}
		System.out.println("Congratulations! You won the game!");
		MainScan.close();
	}

}
