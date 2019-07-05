package id.bts.springcertification;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import id.bts.springcertification.helper.AppContextAware;
import id.bts.springcertification.helper.CustomInit;
import id.bts.springcertification.helper.DisposableBeanTest;


public class SpringCertificationApplication {

	public static void main(String[] args) {
		
		// Load multiple xml configuration
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml", "service.xml", "life_cycle.xml");
		
		// get customInit bean by name
		CustomInit customInit = (CustomInit) context.getBean("initBean");
		
		// trigger the constructor
		System.out.println(customInit);
		
		// call a InitializingBeanTest Class to trigger the constr
		context.getBean("initializingBean");
		
		// Implement DisposableBean make it easy to override destroy() by default.
		@SuppressWarnings("unused")
		DisposableBean disposableBean = (DisposableBeanTest) context.getBean("disposableBean");
		
		//call contextAwareBean by type and call display Method
		//Tell contextAwareBean to get disposableBean from context
		context.getBean(AppContextAware.class).display();;
		
		// trigger custom destroy method
		((AbstractApplicationContext)context).registerShutdownHook();
		
		
	}

}
