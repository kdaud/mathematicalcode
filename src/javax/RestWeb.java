package javax;


public class RestWeb {
	
	private int studentid;
	
	private String name;
	
	private String course;
	
	private String school;
	
	private Double gpa;
	
	/**
	 * @return the studentid
	 */
	public int getStudentid() {
		return studentid;
	}
	
	/**
	 * @param studentid the studentid to set
	 */
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}
	
	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
	/**
	 * @return the gpa
	 */
	public Double getGpa() {
		return gpa;
	}
	
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RestWeb [studentid=" + studentid + ", name=" + name + ", course=" + course + ", University=" + school
		        + ", gpa="
		        + gpa + "]";
	}
	



}
