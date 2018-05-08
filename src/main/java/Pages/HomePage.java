package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {
	

	//PageFactory or OR
	
	@FindBy(xpath="//a[text()='Calendar']")
	WebElement Calendar_Tab;
	
	@FindBy(xpath="//a[text()='Companies']")
	WebElement Companies_Tab;
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement Contacts_Tab;

	//Initializing PageFactory

	public HomePage() {
		PageFactory.initElements(driver, this);
	}	

	public ContactsPage ClickOnContactsTab() {
		Contacts_Tab.click();
		return new ContactsPage();
		
	}
}
