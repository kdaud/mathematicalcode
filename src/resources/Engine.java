package resources;

import java.util.Stack;

public class Engine extends DataStructure {
	
	@Override
	public void myapi() {
		Stack<String> commiter = new Stack<>();
		commiter.add("kdaud");
		commiter.add("Male");
		commiter.add("dkayiwa");
		commiter.add("scull");
		commiter.add("sutherger");
		System.out.println("Capacity: " + commiter.capacity());
		System.out.println("Size: " + commiter.size());
		System.out.println("******************");
		System.out.println(commiter.clone());
		System.out.println("The commiter on the top is: " + commiter.push("modric"));
		System.out.println(commiter.clone());
		
		for (int p = 0; p <= commiter.size() - 1; p++) {
			/*
			 * /System.out.println(commiter.get(p));
			 * 
			 */
			//System.out.println(commiter.peek());
		}
		System.out.println("\\||||||*********");
		int y = 0;
		while (y <= commiter.size() - 1) {
			System.out.println(commiter.elementAt(y));
			y++;
		}
		
	}
	
	@Override
	public String queque() {
		
		return null;
	}
	
}
