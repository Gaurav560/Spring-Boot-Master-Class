package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	public void checkout(String dString) {

		// we do cross cutting concerns separately such as
		// logging,authorization,authentication,sanitization of data

		// this is my business logic
		System.out.println("checkout method from shoppingCart class is called ");
	}
	public int quantity() {
		return 2;
	}
}
