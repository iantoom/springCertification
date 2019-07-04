package id.bts.springcertification.helper;

import org.springframework.beans.factory.DisposableBean;

public class DisposableBeanTest implements DisposableBean {

	private String message;
	private String name;
	
	public DisposableBeanTest() {
		System.out.println("Disposable Bean Constructor gets called");
		this.message = "Aloha!";
		this.name = "Ding diring ding ding";
	}
	
	public void testForContextAware() {
		System.out.println("Disposable Bean called from Application Context Aware");
	}
	
	@Override
	public String toString() {
		return "DisposableBeanTest [message=" + message + ", name=" + name + "]";
	}

	@Override
	public void destroy() throws Exception {
	
		System.out.println("Oh no, Disposable bean destroyed");
	}

	
}
