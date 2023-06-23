package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//this annotation is telling that ,this is my configuration class


@ComponentScan(basePackages = "demo")
//this annotation is used to scan the component class 

@EnableAspectJAutoProxy
//for enabling aop
public class BeanConfig {

}
