package Framework;

import org.testng.annotations.Test;

@Test
public class TestAnnotationOnClass {
	public void createContact()
	{
		
		System.out.println("Contact created");
	}


	public void modifyContact()
	{
		System.out.println("Contact modified");
	}
	

	public void deleteContact() 
	{
		System.out.println("Contact Deleted");
	}

}
