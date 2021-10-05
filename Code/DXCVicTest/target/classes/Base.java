package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
	public  static Properties prop;
	
	public WebDriver InitializeDriver() throws IOException
	{
	    prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\STUDY MATERIALS\\JAVA_WORKSPACE\\DXCVicTest\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		//String browserName=System.getProperty("browser");//read data from maven
		String browserName=prop.getProperty("browser");//read data from the property file
		System.out.println(browserName);
		
		
		//Executing in headless mode
		if(browserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions options=new ChromeOptions();
			if(browserName.contains("headless"))
			{
				options.addArguments("headless","user-agent=mrbean");//heart of this mode of execution
			}
		    driver=new ChromeDriver(options);
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		
		else if(browserName=="IE")
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	
	}

}
