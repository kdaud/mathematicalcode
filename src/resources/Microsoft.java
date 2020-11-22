package resources;

import java.util.HashMap;
import java.util.Map;

public class Microsoft {
	
	public static void main(String[] args) {
		Facebook obj = new Facebook();
		String object = obj.connector("Artic Code Vaulter");
		System.out.println(object);
		new GoogleApi() {
			
			@Override
			public String connector(String id) {
				System.out.println(id + ": Yo donot need to be genenious You need to be determined");
				return id;
			}
			
			@Override
			public boolean isCustomerValid() {
				System.out.println("Bolean deals with True or False ");
				return false;
			}
		}.connector("Daud Kakumirizi");
		printer();
		
	}
	
	public String myMap(String name) {
		Map<String, Character> myResult = new HashMap<>();
		myResult.put("Catering", 'A');
		myResult.put("Linux Advanced", 'A');
		myResult.put("Information Security", 'A');
		myResult.put("Parallel & Distributed System", 'A');
		myResult.put("Operating System", 'A');
		myResult.put("PC Repair & Maintainance", 'A');
		System.out.println(myResult);
		
		//		Iterator<String> mylist = (Iterator<String>) myResult.entrySet();
		//		while (mylist.hasNext()) {
		//			System.out.println(mylist);
		//			
		//		}
		System.out.println("||||||||||||||||||||||>>>>>>>>>>>>??????\\\\||||");
		
		//		for (int i = 0; i <= myResult.size() - 1; i++) {
		//			System.out.println(i);
		//		}
		for (String key : myResult.keySet()) {
			System.out.println(key + " --------->" + myResult.get(key));
		}
		System.out.println("*******************************");
		System.out.println("This is magic");
		myResult.forEach((K, V) -> System.out.println(K + " " + V));
		

		return "";
	}
	
	public static void printer() {
		Microsoft obj = new Microsoft();
		System.out.println("\n************************************");
		System.out.println("Welcome To the World of Programming");
		obj.myMap("Daud Kakumirizi");
	}
	
}
