package highschool;

import java.util.Hashtable;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Coder extends Object {
	
	private static String committer(String coder) {
		Map<String, String> commit = new Hashtable<>();
		commit.put("kdaud", "java");
		commit.put("samuelmale", "javascript");
		commit.put("dkayiwa", "swift");
		commit.put("jnsereko", "php");
		
		commit.forEach((J, Y) -> System.out.println(J + "   " + Y));
		return coder;
	}
	
	public static void main(String[] args) {
		//committer("Kakumirizi");
		new Coder().myCode();
	}
	
	public void myCode() {
		Queue<String> student = new PriorityQueue<>();
		student.add("Software");
		student.add("Engineering");
		student.add("Networking");
		student.add("Coding");
		System.out.println("Element on top: " + student.peek());
		System.out.println(student.offer("Programming"));
		
		//		for (String s : student) {
		//			System.out.println(s);
		//		}
		student.forEach((X) -> System.out.println(X));
		
	}
	
}
