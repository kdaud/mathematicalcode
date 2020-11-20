package tests;

import java.util.Scanner;

public class MyTec {
	
	Scanner scanner = new Scanner(System.in);
	
	public String myData() {
		String name = scanner.nextLine();
		
		String myName = name.toUpperCase();
		System.out.println(myName);
		System.out.println("The text entered contains " + myName.length() + " characters");
		return name;
	}
	
}
