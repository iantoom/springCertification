package id.bts.springcertification;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import id.bts.springcertification.helper.CustomInit;


public class SpringCertificationApplication {

	public static void main(String[] args) {
		
		// Load multiple xml configuration
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml", "service.xml", "life_cycle.xml");
		
		// get customInit bean by name
		CustomInit customInit = (CustomInit) context.getBean("initBean");
		
		// trigger the constructor
		System.out.println(customInit);
		
		// Implement DisposableBean make it easy to override destroy() by default.
		DisposableBean disposableBean = (DisposableBean) context.getBean("disposableBean");
		
		// trigger custom destroy method
		((AbstractApplicationContext)context).registerShutdownHook();
		
		
	}

}
