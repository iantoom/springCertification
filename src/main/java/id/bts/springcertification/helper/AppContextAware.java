package id.bts.springcertification.helper;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppContextAware implements ApplicationContextAware {

	private ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("context set");
		this.context = applicationContext;
	}

	public void display() {
		((DisposableBeanTest) context.getBean("disposableBean")).testForContextAware();
	}

}
