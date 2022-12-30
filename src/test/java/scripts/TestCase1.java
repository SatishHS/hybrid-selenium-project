package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemo;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();
		
		SkillraryDemo sd=new SkillraryDemo(driver);
		driverUtilities.switchTabs(driver);						//switch tabs
		driverUtilities.mouseHover(driver, sd.getCoursetab());	//mouse hover
		sd.selenium();
		
		AddtoCartPage ad= new AddtoCartPage(driver);
		driverUtilities.doubleClick(driver, ad.getAddbtn());	//double click on plus sign
		ad.addtocartbutton();
		driverUtilities.alertpopup(driver);
	}

}
