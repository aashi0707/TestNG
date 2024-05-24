package Framework;

import org.testng.annotations.Test;

public class TestNGDependsOn {

	@Test(priority = 2)
	public void createContact()
	{
		
		System.out.println("Contact created");
	}

	@Test(dependsOnMethods = "createContact")
	public void modifyContact()
	{
		System.out.println("Contact modified");
	}
	
	@Test(enabled = false)
	public void deleteContact() 
	{
		System.out.println("Contact Deleted");
	}
}
