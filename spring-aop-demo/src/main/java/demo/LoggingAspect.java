package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	//twodots means whatever the parameter is ,it will match
	@Before("execution(* demo.ShoppingCart.checkout(..))")
	public void beforeloggers(JoinPoint jp) {
	//System.out.println(jp.getSignature());\
		String arg=jp.getArgs()[0].toString();
		System.out.println("Before Loggers with arguments::"+arg);
	}
	
	
	
	// 1st star-any return type
	//2nd star for any package
	//3rd star for any class 
	@After("execution(* *.*.checkout(..))")
	public void AfterLoggers(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature());
		System.out.println("After Loggers");
	}
	
	@Pointcut("execution(* demo.ShoppingCart.quantity(..))")
	public void afterReturningPointCut() {
		
	}
	
	
	@AfterReturning(pointcut = "afterReturningPointCut()",returning = "retVal")
	public void afterReturning(String retVal) {
		System.out.println("After Returning "+retVal);
	}
}
