package resources;

public class Google implements GoogleApi {
	
	static {
		System.out.println("Hello Open source software engineering");
	}
	
	@Override
	public String connector(String id) {
		String mydata = id;
		return mydata;
	}
	
	@Override
	public boolean isCustomerValid() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
