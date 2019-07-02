package id.bts.springcertification;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringCertificationApplication {

	public static void main(String[] args) {
		
		// Load multiple xml configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml", "service.xml", "life_cycle.xml");
		
		
	}

}
