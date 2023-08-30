package factory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriveFactory  {
		public WebDriver driver;
		public WebDriver initDriver(String browserName,Properties prop)
		{
			System.out.println("browser name is:" +browserName);
			switch(browserName.toLowerCase())
			{
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
				default:
					System.out.println("plz pass the right browser name..."+browserName);
					break;
			}
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			return driver;
			
		}

	}
