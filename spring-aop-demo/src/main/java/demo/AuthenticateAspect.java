package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
//component annotation se pata chal jaayegaspring container ko ki ye class bean hai
public class AuthenticateAspect {

	
	@Pointcut("within(demo..*)")
	public void authenticatingPointCut() {
		
	}
	
	
	@Pointcut("within(demo..*)")
	public void authorization() {
		
		
	}
	
	
	@Before("authenticatingPointCut() && authorization()")
	public void authenticate() {
		System.out.println("authenticating the request ");
	}
	
	
	
}
