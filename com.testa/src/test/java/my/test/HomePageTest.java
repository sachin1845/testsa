package my.test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import confireader.CofirgReader;
import factory.DriveFactory;
import page.HomePage;

public class HomePageTest {

	DriveFactory df;
	CofirgReader cp;
	WebDriver driver;
	Properties prop;
	HomePage homepage;
	
	@BeforeTest
	public void setup() throws IOException {
		cp=new CofirgReader();
		 prop = cp.initLangProp("french");
		 df=new DriveFactory();
		 driver=df.initDriver("url", prop);
		 homepage=new HomePage(driver);
	}
	
	@Test
	public void headerTest()
	{
		Assert.assertTrue(homepage.isHeaderExsit(prop.getProperty("header")));
	}
	
	@Test
	public void contactFooterTest()
	{
	Assert.assertTrue(homepage.isContactExsit(prop.getProperty("contact")));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
