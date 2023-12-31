package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class doctor implements Staff, BeanNameAware {

	private String qualification;

	// to string overridden
	@Override
	public String toString() {
		return "doctor [qualification=" + qualification + "]";
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void assist() {

		System.out.println("Doctor is assisiting...");
	}

	public void setBeanName(String name) {
		System.out.println("set Bean Name method is called.");

	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct Method is called.");
	}
}
