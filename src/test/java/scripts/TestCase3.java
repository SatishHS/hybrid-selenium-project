package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.Wishlist;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc1() throws IOException, InterruptedException
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
