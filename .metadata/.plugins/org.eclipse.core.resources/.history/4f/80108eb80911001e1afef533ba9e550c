package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 public static void main(String[] args) {
	 
//	 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	 
ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
	 
	doctor doc=context.getBean(doctor.class);
//	nurse nurse=context.getBean(nurse.class);
//	Staff staff=context.getBean(nurse.class);
	doc.assist();
	

}
}
