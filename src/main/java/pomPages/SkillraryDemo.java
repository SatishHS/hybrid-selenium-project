package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemo 
{
	//declaration
		@FindBy(id="course")
		private WebElement coursetab;
		
		@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
		private WebElement seleniumtraining;
		
		@FindBy(name="addresstype")
		private WebElement coursedd;
		
		//initialization
		public SkillraryDemo(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public WebElement getCoursetab() 
		{
			return coursetab;					//mouse hover so getters() is used
		}
		public void selenium()
		{
			seleniumtraining.click();
		}

		public WebElement getCoursedd() {
			return coursedd;					//dropdown for second scenario
		}
		

		

}
