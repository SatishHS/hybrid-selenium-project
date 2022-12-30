package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage 
{
	//declaration
			@FindBy(id="add")
			private WebElement addbtn;
			
			@FindBy(xpath="(//button[text()=' Add to Cart'])")
			private WebElement addtocartbtn;
			
			//initialization
			public AddtoCartPage (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//utilization
			public WebElement getAddbtn() 
			{
				return addbtn;					//double click so getters() is used
			}
			public void addtocartbutton()
			{
				addtocartbtn.click();
			}

			

}
