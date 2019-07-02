package id.bts.springcertification.repository;

public class JpaDao {

	private String testString = "Hello, JpaDao Bean is successfully Instantiated";
	
	public String findTestString() {
		return testString;
	}
}
