package Practice;

import org.testng.annotations.Test;

public class Working_with_TestAnnotaion2 {

	@Test(invocationCount=5,priority=1)
	public void register()
	{
		System.out.println("registration successfull");
	}

	@Test(priority=2)
	public void login()
	{
		
	System.out.println("login successfull");
	}

	@Test(enabled=false)
	public void addToCart()
	{
	System.out.println("product added to cart");
	}

	@Test(priority=4)
	public void placeOrder()
	{
	System.out.println("Order placed");
	}
	}
	
	
	
	
	
	

