package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ContactsPage;
import Pages.HomePage;
import Pages.LoginPage;
import Util.TestUtilities;

public class HomePageTest extends TestBase{
	HomePage homepage;
	LoginPage loginpage;
	ContactsPage contactspage;
	TestUtilities testutil;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		homepage= new HomePage();
		loginpage= new LoginPage();
		contactspage= new ContactsPage();	
		testutil= new TestUtilities();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void ContactsTabTest() {
		testutil.SwitchToFrame();
		homepage.ClickOnContactsTab();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
