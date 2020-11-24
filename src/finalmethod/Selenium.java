package finalmethod;


public class Selenium {
	
	public static void main(String[] args) {
		BaseZ obj = new Child();
		obj.setPatientName("Wakiro Ivan");
		obj.setConcept("Biochemistry");
		obj.setAge(29);
		obj.patientData();
		System.out.println(obj.getPatientName() + " offers " + obj.getConcept());
		
	}
	
}
