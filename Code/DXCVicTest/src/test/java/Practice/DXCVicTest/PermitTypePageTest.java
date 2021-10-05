package Practice.DXCVicTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.PermitTypePage;
import resources.Base;

public class PermitTypePageTest extends Base {
	public WebDriver driver;
	
	@BeforeTest
	public void Initialize() throws IOException
	{
		driver=InitializeDriver();//This method returns driver
		driver.get(prop.getProperty("url"));	
	}
  
	@Test
	 public void PermitTest()
	 {
		PermitTypePage permit=new PermitTypePage(driver);
		Assert.assertTrue(permit.getPermitLabel().isDisplayed());
	 }
}
