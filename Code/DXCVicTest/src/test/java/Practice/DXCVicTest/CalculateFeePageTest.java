package Practice.DXCVicTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.CaluculateFeePage;
import resources.Base;

public class CalculateFeePageTest extends Base {
	
	public WebDriver driver;
	
	@Test
	public void CalculateFee() throws IOException, InterruptedException
	{
		driver=InitializeDriver();//This method returns driver
		driver.get(prop.getProperty("url"));
		CaluculateFeePage fee=new CaluculateFeePage(driver);
		WebElement vehicletypestaticdropdown=driver.findElement(By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_VehicleType_DDList"));
		Select vehicletypedropdown=new Select(vehicletypestaticdropdown);
		vehicletypedropdown.selectByIndex(1);
		WebElement passengervehiclestaticdrpdn=driver.findElement(By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_PassengerVehicleSubType_DDList"));
		Select passengervehicletypedropdwn=new Select(passengervehiclestaticdrpdn);
		passengervehicletypedropdwn.selectByIndex(1);
		fee.getAddress().sendKeys("Unit 33 45 Rosanna Road,Heidelberg vic 3084");
		Thread.sleep(3000);
		List< WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("Unit 33 45 Rosanna Rd, HEIDELBERG VIC 3084"))
			{
				option.click();
				break;
			}
		}
		
		fee.getCalender().click();
		fee.getDate().click();
		WebElement permitdropdwn=driver.findElement(By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_PermitDuration_DDList"));
		Select permitdrpdwnlist=new Select(permitdropdwn);
		permitdrpdwnlist.selectByIndex(3);
		fee.getNextBtn().click();
	}

}
