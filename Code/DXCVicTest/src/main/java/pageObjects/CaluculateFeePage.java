package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaluculateFeePage {
	
	public WebDriver driver;
	
	By vehicletypedrodwn=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_VehicleType_DDList");
	By passengervehicletypedrpdwn=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_PassengerVehicleSubType_DDList");
	By address=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_AddressLine_SingleLine_CtrlHolderDivShown");
	By calender=By.xpath("//img[@class='ui-datepicker-trigger']");
	By date=By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active");
	By permitdurationdrpdwn=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_PermitDuration_DDList");
	By nextbtn=By.xpath("//input[@value='Next']");
	
	
	public CaluculateFeePage( WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getVehicleTypeDropDown()
	{
		return driver.findElement(vehicletypedrodwn);
	}
	
	public WebElement getPassengerVehicleTypeDropDown()
	{
		return driver.findElement(passengervehicletypedrpdwn);
	}
	
	public WebElement getAddress()
	{
		return driver.findElement(address);
	}
	
	public WebElement getCalender()
	{
		return driver.findElement(calender);
	}
	
	public WebElement getDate()
	{
		return driver.findElement(date);
	}
	
	public WebElement getPermitDurationDropDown()
	{
		return driver.findElement(permitdurationdrpdwn);
	}
	
	public WebElement getNextBtn()
	{
		return driver.findElement(nextbtn);
	}

}
