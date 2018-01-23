/**
 * 
 */
package com.ajita_flipkart;

import com.ajita_flipkart.page.HomeTestPage;
import com.ajita_flipkart.page.SelectfilterTestPage;
import com.ajita_flipkart.page.SelectproductTestPage;
import com.ajita_flipkart.page.ValidateTestPage;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;

/**
 * @author Ajita.Sahay
 */
public class StepsBackLog {
	HomeTestPage home = new HomeTestPage();
	SelectfilterTestPage filter = new SelectfilterTestPage();
	SelectproductTestPage selectproduct = new SelectproductTestPage();
	ValidateTestPage check=new ValidateTestPage();

	@QAFTestStep(description = "user opens flipkart application")
	public void userOpensFlipkartApplication() {
		home.launchSite();
		home.closeLoginPopup();
	}

	@QAFTestStep(description = "user selects {0} from {1} section")
	public void userSelectsFromSection(String submenu, String menu) {
		home.selectSection(menu, submenu);
	}

	@QAFTestStep(description = "user choose flipkart Assured filter option")
	public void userChooseFlipkartAssuredFilterOption() {
		filter.filterByBrand();
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user selects {0} filter option")
	public void userSelectsFilterOption(String str0) {
		filter.filterByPrice("Price -- High to Low");
	}

	@QAFTestStep(description = "user selects {0} product")
	public void userSelectsProduct(String str0) {
		selectproduct.selectProductName(0);
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user enter the {0} pin code")
	public void userEnterThePinCode(String str0) {
		selectproduct.enterPinCode();
	}

	@QAFTestStep(description = "user select {0} for verify")
	public void userSelectForVerify(String str0) {
		check.clickViewDeatils();
		check.verifyFlipkartAssured();
	}

}
