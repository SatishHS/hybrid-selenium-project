package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage 
{
	@FindBy(xpath="//a[@title='Core Java For Selenium Training']")
	private WebElement corejava;
	
	public CoreJavaPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void careJava()
	{
		corejava.click();
	}

}
