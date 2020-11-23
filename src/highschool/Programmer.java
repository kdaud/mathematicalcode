package highschool;

import java.util.Hashtable;
import java.util.Map;

public final class Programmer {
	
	static {
		System.out.println("*********************");
	}
	
	public String myJourney(String todo) {
		System.out.println(todo);
		Map<String, Integer> patientconcept=new Hashtable<>();
		patientconcept.put("Malaria", new Integer(12));
		patientconcept.put("Covid-19", new Integer(10));
		patientconcept.put("Hipatitis", new Integer(16));
		patientconcept.put("Syphils", new Integer(6));
		patientconcept.put("Cough", new Integer(9));
		
		for (String iterable_element : patientconcept.keySet()) {
			System.out.println(iterable_element + "******** " + patientconcept.get(iterable_element));
		}
		System.out.println("||||||||||||||||||||||||");
		
		patientconcept.forEach((Q, S) -> System.out.println(Q + " ^^^^^^ " + S));
		
		String searchKey="Cough";
		if (patientconcept.containsKey(searchKey)) {
			System.out.println("Found out: " + patientconcept.get(searchKey) + " ------> " + searchKey);
		}
		return todo;
		
	}
	
	static {
		System.out.println(
		    "Programmers of tommorow will be the wizzards of the future. People will have to think you have magic powers "
		            + "commpared to any one else");
	}
	static {
		System.out.println("God is ever good to me!");
	}
	
}
