package com.ajita_flipkart.page;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SelectfilterTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "filter.lbl")
	private QAFWebElement filterLbl;
	@FindBy(locator = "filter.chkbx")
	private QAFWebElement filterChkbx;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getFilterLbl() {
		return filterLbl;
	}

	public QAFWebElement getFilterChkbx() {
		return filterChkbx;
	}
	
	
	
	public void filterByPrice(String choose)
	{
		QAFExtendedWebElement choosesection=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("filter.lbl"), choose));
		driver.manage().window().maximize();
		choosesection.click();
	}
	
	public void filterByBrand()
	{
		filterChkbx.click();
	}
	


}
