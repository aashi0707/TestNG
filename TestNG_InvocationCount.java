package Framework;

import org.testng.annotations.Test;

public class TestNG_InvocationCount {

	@Test(priority = 2)
	public void createContact()
	{
		
		System.out.println("Contact created");
	}

	@Test(invocationCount = 3)
	public void modifyContact()
	{
		System.out.println("Contact modified");
	}
	
	@Test
	public void deleteContact() 
	{
		System.out.println("Contact Deleted");
	}
}
