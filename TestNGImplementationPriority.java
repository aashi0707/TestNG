package Framework;

import org.testng.annotations.Test;

public class TestNGImplementationPriority {

	@Test(priority = 2)
	public void createContact()
	{
		System.out.println("Contact created");
	}

	@Test(priority = 3)
	public void modifyContact()
	{
		System.out.println("Contact modified");
	}
	
	@Test(priority=1)
	public void deleteContact() 
	{
		System.out.println("Contact Deleted");
	}
}
