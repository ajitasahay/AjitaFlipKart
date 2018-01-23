package com.ajita_flipkart.page;

import java.util.HashMap;

import org.hamcrest.Matchers;

import com.ajita_flipkart.common_utils.Utils;
import com.ajita_flipkart.details.Product_Details;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class ProductdetailsTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "particular.product.rating.lbl")
	private QAFWebElement particularProductRatingLbl;
	@FindBy(locator = "particular.product.name.lbl")
	private QAFWebElement particularProductNameLbl;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getParticularProductRatingLbl() {
		return particularProductRatingLbl;
	}

	public QAFWebElement getParticularProductNameLbl() {
		return particularProductNameLbl;
	}

	public void verify_rating()
	{
		HashMap<String, Product_Details> prodInf = Utils.getProductList();
		for(String key: prodInf.keySet())
		{
			Product_Details details = prodInf.get(key);
			Validator.verifyThat(getParticularProductRatingLbl().getText(), Matchers.containsString(details.productRating));
		}
		
	}
	
	
}
