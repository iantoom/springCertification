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
	
	@Override
	public String toString() {
		return "DisposableBeanTest [message=" + message + ", name=" + name + "]";
	}

	@Override
	public void destroy() throws Exception {
	
		System.out.println("Oh no, Disposable bean destroyed");
	}

	
}
