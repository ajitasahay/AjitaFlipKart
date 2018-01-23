package com.ajita_flipkart.product_component;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Product_Name_Rating extends QAFWebComponent {

	public Product_Name_Rating(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}
	@FindBy(locator = "product.name.lbl")
	private QAFWebElement productNameLbl;
	@FindBy(locator = "product.rating.lbl")
	private QAFWebElement productRatingLbl;
	
	public QAFWebElement getProductNameLbl() {
		return productNameLbl;
	}

	public QAFWebElement getProductRatingLbl() {
		return productRatingLbl;
	}

}
