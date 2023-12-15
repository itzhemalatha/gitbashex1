package Practice;

import org.testng.annotations.Test;

public class Working_with_DependsonMethods {
	
	
	@Test(dependsOnMethods="registration")
	public void login()
	{
		System.out.println("login");
	}

	@Test  
	public void registration()
	{
		System.out.println("Registration");
	}	
}
