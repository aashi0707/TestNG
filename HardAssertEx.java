package Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	
	@Test
	public void method1() 
	{
		System.out.println("Step1");
		System.out.println("Step2");
		Assert.assertEquals(true, false);
		System.out.println("Step3");
		System.out.println("Step4");
	}
	
	@Test
	public void method2()
	{
		String ExpData = "Qspiders";
		String ActData = "Qspiders";
		Assert.assertEquals(ActData, ExpData);
	}
	

}
