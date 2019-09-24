package package1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	@Given("I enter 50 in calculator")
	public void given()
	
	{
		System.out.println("I enter 50 in calculator");
	}
	@And("I press add")
	public void and()
	
	{
		System.out.println("I press add");
	}
	@And("I have entered 50 in calculator")
	public void andd()
	
	{
		System.out.println("I have entered 50 in calculator");
	}
	@When("I press equal symbol")
	public void when()
	
	{
		System.out.println("I press equal symbol");
	}
	@Then("The result should be 100 on screen")
	public void then()
	
	{
		System.out.println("The result should be 100 on screen");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
