package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist 
{
	@FindBy(xpath ="//a[@class='close_cookies']")		//close cookies
	private WebElement closecookies;
	
	@FindBy(xpath="//span[text()='Play']")				//span[text()='Play'] not getting this xpath
	private WebElement playbtn;
	
	@FindBy(xpath="//span[text()='Pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//i[@class='fa fa-heart-o']")
	private WebElement wishlistbtn;
	
	public Wishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closecookies()
	{
		closecookies.click();
	}
	public void playButton()
	{
		playbtn.click();
	}
	public void pauseButton()
	{
		pausebtn.click();
	}
	public void addWishlist()
	{
		wishlistbtn.click();
	}
	
}
