package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ElementUtils;

public class HomePage {
	private WebDriver driver;
	private ElementUtils elementUtil;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		elementUtil=new ElementUtils(driver);		
	}
	
	public WebElement getHeaderElement(String headvalue)
	{
		String headerXpathVaule="//a[contains(text(),'"+headvalue+"')]";
		return elementUtil.getElement("xpath", headerXpathVaule);
	}

	public boolean isHeaderExsit(String headerValue)
	{
		String header = getHeaderElement(headerValue).getText();
		System.out.println(header);
			return getHeaderElement(headerValue).isDisplayed();
		}
	private WebElement getContactElement(String contactValue)
	{
	String contactXpathValue = "//a[contains(text(),'"+contactValue+"')]";
	return elementUtil.getElement("xpath", contactXpathValue);
	}
	
	public boolean isContactExsit(String contactValue)
	{
		String contact=getHeaderElement(contactValue).getText();
		System.out.println(contact);
		return getContactElement(contactValue).isDisplayed();
	}
	}

