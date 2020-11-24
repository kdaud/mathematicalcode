package finalmethod;


public class BaseZ {
	
	private String patientName;
	
	private String concept;
	
	private int age;
	
	/**
	 * @return the patientName
	 */

	public String getPatientName() {
		return patientName;
	}
	
	/**
	 * @param patientName the patientName to set
	 */
	
	public void setPatientName(String name) {
		this.patientName = name;
	}
	
	/**
	 * @return the concept
	 */
	public String getConcept() {
		return concept;
	}
	
	/**
	 * @param concept the concept to set
	 */
	public void setConcept(String concept) {
		this.concept = concept;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public final void patientData() {
		System.out.println("Nakasongola Health Centre IV");
		System.out.println("Patient Name: " + patientName + "\nAge: " + age + "\nConcent: " + concept);
	}

}
