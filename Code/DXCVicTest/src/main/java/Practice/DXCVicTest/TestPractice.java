package Practice.DXCVicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vicroads.vic.gov.au/registration/limited-use-permits/unregistered-vehicle-permits/get-an-unregistered-vehicle-permit");
		
		
		WebElement vehicletypestaticdropdown=driver.findElement(By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_VehicleType_DDList"));
		Select vehicletypedropdown=new Select(vehicletypestaticdropdown);
		vehicletypedropdown.selectByIndex(1);
		
		//System.out.println(vehicletypedropdown.getFirstSelectedOption().getText());
		
		WebElement passengervehiclestaticdrpdn=driver.findElement(By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_PassengerVehicleSubType_DDList"));
		Select passengervehicletypedropdwn=new Select(passengervehiclestaticdrpdn);
		passengervehicletypedropdwn.selectByIndex(1);
		driver.findElement(By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_AddressLine_SingleLine_CtrlHolderDivShown")).sendKeys("Unit 33 45 Rosanna Road,Heidelberg vic 3084");
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
		
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		WebElement permitdropdwn=driver.findElement(By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_PermitDuration_DDList"));
		Select permitdrpdwnlist=new Select(permitdropdwn);
		permitdrpdwnlist.selectByIndex(3);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		//Assert.assertEquals(driver.findElement(By.xpath("//p[@class='progress-bar-title']")).getText(),"Step 2 of 7 : Select permit type");
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='progress-bar-title']")).isDisplayed());


		
		
		
		
		
	}

}
