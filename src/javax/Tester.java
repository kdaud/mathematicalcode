package javax;

import java.util.Scanner;

public class Tester {
	
	static Scanner scanner = new Scanner(System.in);
	
	static {
		System.out.println("You need to be Determined");
	}
	public static void main(String[] args) {
		RestWeb obj= new RestWeb();
		System.out.println("Enter your school id: ");
		int idd= scanner.nextInt();
		obj.setStudentid(idd);
		
		System.out.println("Enter your name: ");
		String name=scanner.next();
		obj.setName(name);
		
		System.out.println("Enter your course: ");
		String course= scanner.next();
		obj.setCourse(course);
		
		System.out.println("Enter your University name: ");
		String school=scanner.next();
		obj.setSchool(school);
		
		System.out.println("Enter your current Gpa: ");
		 double gpa = scanner.nextDouble();
		obj.setGpa(gpa);
		

		
		
		System.out.println(obj.toString());
	}
	
}
