package com.ajita_flipkart.page;

import org.hamcrest.Matchers;
import org.openqa.selenium.interactions.Actions;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "homepage.menu.lnk")
	private QAFWebElement homepageMenuLnk;
	@FindBy(locator = "homepage.submenu.lnk")
	private QAFWebElement homepageSubmenuLnk;
	@FindBy(locator = "login.popup.dismiss")
	private QAFWebElement loginPopupDismiss;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getHomepageMenuLnk() {
		return homepageMenuLnk;
	}

	public QAFWebElement getHomepageSubmenuLnk() {
		return homepageSubmenuLnk;
	}
	
	public void selectSection(String menu,String submenu)
	{
		QAFExtendedWebElement selectsection=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("homepage.menu.lnk"), menu));
		Actions act=new Actions(driver);
		act.moveToElement(selectsection).perform();
		QAFExtendedWebElement selectsubsection=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("homepage.submenu.lnk"), submenu));
		selectsubsection.waitForVisible(4000);
		selectsubsection.click();
		
		
	}

	public QAFWebElement getLoginPopupDismiss() {
		return loginPopupDismiss;
	}
	
	
	public void launchSite()
	{
		driver.get("/");
	}
	
	
	public void verifyflipKartHomePage()
	{
		Validator.verifyThat("Flipkart home page verification", driver.getTitle(),Matchers.containsString("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"));
		
	}

	
	public void closeLoginPopup()
	{
		if(loginPopupDismiss.isDisplayed())
		{
			loginPopupDismiss.click();
		}
	}

}
