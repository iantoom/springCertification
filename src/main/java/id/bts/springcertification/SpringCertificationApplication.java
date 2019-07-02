package id.bts.springcertification;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import id.bts.springcertification.repository.JpaDao;
import id.bts.springcertification.service.MyServiceImpl;

@SpringBootApplication
public class SpringCertificationApplication {

	
	public static void main(String[] args) {
//		deprecated Library
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		/**
		 * Instantiate a bean factory and add a Bean Definition reader from XML files
		 */
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("beans_classpath.xml"));
		
		try {
			/**
			 * try to retrieve a bean by type.
			 */
			MyServiceImpl myServiceBean = (MyServiceImpl) beanFactory.getBean(MyServiceImpl.class);
			
			/**
			 * The Dependency injection failed, You need to provide a name for JpaDao Bean
			 * to be able to use Dependency Injection with ref element in XML config.
			 */
			System.out.println(myServiceBean.getJpaDao().findTestString());
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		JpaDao myJpaDao = (JpaDao) beanFactory.getBean(JpaDao.class);
		
		System.out.println("Calling JpaDao Bean: " + myJpaDao.findTestString());
	}

}
