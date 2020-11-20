package resources;

import java.util.LinkedList;
import java.util.Queue;
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
		System.out.println("QueQue Implementation");
		Queue<String> liStrings = new LinkedList<>();
		liStrings.add("ric");
		liStrings.add("ivan");
		liStrings.add("henry");
		liStrings.add("joyce");
		System.out.println(liStrings.size());
		System.out.println(liStrings.getClass());
		for (int y = 0; y <= liStrings.size() - 1; y++) {
			System.out.println(liStrings.contains("hr"));
		}
		return null;
	}
	
}
