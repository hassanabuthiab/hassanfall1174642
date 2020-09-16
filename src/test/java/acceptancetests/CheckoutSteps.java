package acceptancetests;

import static org.junit.Assert.assertEquals;

import HW.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
	
	Checkout checkout = new Checkout();
	
	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String product, Integer price) {
		;
		checkout.addProd(product, price);
		
	}



	@When("I checkout {int} {string}")
	public void iCheckout(Integer amount, String product) {
	
		
		checkout.getProd(product, amount);
		
	}
	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer totalprice) {
		
		assertEquals(totalprice.intValue(), checkout.total());
		
	}

}
