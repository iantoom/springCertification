package id.bts.springcertification.helper;

import org.springframework.beans.factory.InitializingBean;

public class InitializingBeanTest implements InitializingBean {

	private String message;
	private String name;
	
	public InitializingBeanTest() {
		System.out.println("IniitializingBean Implementation constructor get called here!!!");
		this.message = "InitBeanImpl custom init method called Here!!";
		this.name = "Mr. InitializingBean";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println(message + " " + name); 
	}

	@Override
	public String toString() {
		return "InitializingBeanTest [message=" + message + ", name=" + name + "]";
	}
	

}
