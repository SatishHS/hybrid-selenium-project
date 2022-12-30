package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillraryDemo;
import pomPages.SkillraryLoginPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc1() throws IOException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();
		
		SkillraryDemo sd=new SkillraryDemo(driver);
		driverUtilities.switchTabs(driver);						//switch tabs
		driverUtilities.dropdown(sd.getCoursedd(), pdata.getData("coursedd"));
		
		CoursePage cp= new CoursePage(driver);
		driverUtilities.draganddrop(driver, cp.getCucumber(), cp.getCartarea());
		WebElement loc = cp.getFacebook();
		Point l = loc.getLocation();
		int x = l.getX();
		int y = l.getY();
		driverUtilities.scrollBar(driver, x, y);
		cp.facebookicon();
	}
}
