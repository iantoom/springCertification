package id.bts.springcertification;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;

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
		reader.loadBeanDefinitions(new FileSystemResource("beans_classpath.xml"));
	}

}
