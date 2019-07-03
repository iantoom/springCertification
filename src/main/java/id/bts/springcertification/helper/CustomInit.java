package id.bts.springcertification.helper;

public class CustomInit {

	private String message;
	private String name;
	
	public CustomInit() {
		super();
		 System.out.println("constructor gets called for initializing data members in Custom init"); 
		this.message = "welcome!!";
		this.name = "whoever you are";
	}

	@Override
	public String toString() {
		return message + " " + name;
	}
	
	// The custom Init method, turn name instance to Uppercase
	public void myInit() 
	{ 
	  name = name.toUpperCase(); 
	  System.out.println("myInit() get called"); 
	}
	
	public void destroy() 
	{ 
	  name = null; 
	  System.out.println("CustomInitBean destroy called"); 
	} 
	
}
