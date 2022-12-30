package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage 
{
	@FindBy(id="Cucumber")
	private WebElement cucumber;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public CoursePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCucumber() {
		return cucumber;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getFacebook() {
		return facebook;
	}
	
	public void facebookicon()
	{
		facebook.click();
	}

}
	
