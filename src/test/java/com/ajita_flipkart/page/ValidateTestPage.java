package com.ajita_flipkart.page;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ValidateTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "viewdetails.lbl")
	private QAFWebElement viewdetailsLbl;
	@FindBy(locator = "verify.flipkartassured")
	private QAFWebElement verifyFlipkartassured;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getViewdetailsLbl() {
		return viewdetailsLbl;
	}

	public QAFWebElement getVerifyFlipkartassured() {
		return verifyFlipkartassured;
	}
  
	 public void clickViewDeatils()
	 {
		 getViewdetailsLbl().click();
		//validator.verifyThat(getVerifyFlipkartassured().getText(), Matchers.containsString("Flipkart Assured"));
	 }
	 
	 public void verifyFlipkartAssured()
	 {
		 getVerifyFlipkartassured().waitForVisible();
		 if(getVerifyFlipkartassured().isDisplayed())
		 {
			 System.out.println("Flipkart assured is displayed");
		 }
		 else
		 {
			 System.out.println("it is not displayed");
		 }
	 }
}
