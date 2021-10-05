package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PermitTypePage {
	
	public WebDriver driver;
	
	By permitlabel=By.xpath("//p[@class='progress-bar-title']");
	
	public PermitTypePage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getPermitLabel()
	{
		return driver.findElement(permitlabel);
	}
}
