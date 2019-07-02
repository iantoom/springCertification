package id.bts.springcertification;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import id.bts.springcertification.service.BankServiceImpl;

public class SpringCertificationApplication {

	public static void main(String[] args) {
//		The p namespace has to be declared
//		Bean id is bankServiceImpl
//		The BankServiceImpl references a NationalBank bean
//		NationalBank is a scalar value
		
		/**
		 * load class_path XML which declare xmlns:p 
		 */
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("class_path.xml");
		
		/**
		 * Since the BankServiceImpl Bean is anonymous, the id is auto generated
		 * The format is "qualified.class.name#number"
		 */
		BankServiceImpl bankService = (BankServiceImpl) context.getBean("id.bts.springcertification.service.BankServiceImpl#0");
		
		System.out.println(bankService.getBankName());
	}

}
