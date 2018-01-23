package com.ajita_flipkart.page;

import java.util.HashMap;
import java.util.List;

import com.ajita_flipkart.common_utils.Utils;
import com.ajita_flipkart.details.Product_Details;
import com.ajita_flipkart.product_component.Product_Name_Rating;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SelectproductTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "product.lbl")
	private List<Product_Name_Rating> productLbl;
	@FindBy(locator = "pincode.txt")
	private QAFWebElement pincodeTxt;
	@FindBy(locator = "check.click")
	private QAFWebElement checkclick;
	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public List<Product_Name_Rating> getProductLbl() {
		return productLbl;
	}

	public QAFWebElement getPincodeTxt() {
		return pincodeTxt;
	}
	
	public QAFWebElement getCheckClick() {
		return checkclick;
	}


	public void selectProductName(int index)
	{
		
		Product_Details product_details=new Product_Details();
		product_details.setProductName(getProductLbl().get(index).getProductNameLbl().getText());	
		product_details.setProductRating(getProductLbl().get(index).getProductRatingLbl().getText());
		System.out.println("+++++++++++++++++"+getProductLbl().get(index).getProductRatingLbl().getText());
		HashMap<String, Product_Details> productinfo=new HashMap<String, Product_Details>();
		productinfo.put(product_details.productName, product_details);
		getProductLbl().get(index).click();
	    Utils.setProductItem(productinfo);
	    if(driver.getWindowHandles().size()>1)
		{
			Utils.switchToWindow(driver);
			
		}  
	}
	
	public void enterPinCode()
	{
		getPincodeTxt().sendKeys("560037");	
		getCheckClick().click();
	}

	
}
