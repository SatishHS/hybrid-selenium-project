package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.CoreJavaPage;
import pomPages.CoursePage;
import pomPages.SkillraryDemo;
import pomPages.SkillraryLoginPage;
import pomPages.Wishlist;

public class AllTestCases extends BaseClass
{
	@Test (priority = 0, invocationCount = 2)
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
	
	@Test (priority = 1, invocationCount = 2)
	public void tc2() throws IOException
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
	
	@Test (priority = 2, invocationCount = 2)
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchtextbox(pdata.getData("searchbox"));
		s.searchbutton();
		
		CoreJavaPage cj=new CoreJavaPage(driver);
		cj.careJava();
		
		Wishlist w=new Wishlist(driver);
		w.closecookies();
		driverUtilities.switchFrame(driver);
		w.playButton();
		Thread.sleep(5000);
		w.pauseButton();
		driverUtilities.switchBack(driver);
		w.addWishlist();
	}

}
