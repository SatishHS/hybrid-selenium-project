package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
	//declaration
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;				//search text box for scenario 3
	
	@FindBy(xpath="//input[@type='submit']")	//search and click on search button
	private WebElement searchbtn;
	
	//initialization
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void gearsButton()
	{
		gearbtn.click();
	}
	public void skillraryDemoapp()
	{
		demoapp.click();
	}
	public void searchtextbox(String name)
	{
		searchtb.sendKeys(name);
	}
	public void searchbutton()
	{
		searchbtn.click();
	}
}
