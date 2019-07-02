package id.bts.springcertification.helper;

public class CustomInit {

	private String message;
	private String name;
	
	public CustomInit() {
		super();
		 System.out.println("constructor gets called for initializing data membersin Custom init"); 
		this.message = "welcome!!";
		this.name = "whoever you are";
	}

	@Override
	public String toString() {
		return message + " " + name;
	}
	
	public void myInit() 
	{ 
	  name=name.toUpperCase(); 
	  System.out.println("myInit() get called"); 
	}
	
	public void destroy() 
	{ 
	  name=null; 
	  System.out.println("destroy called"); 
	} 
	
}
