package com.ajita_flipkart.steps;

import org.testng.annotations.Test;

import com.ajita_flipkart.page.HomeTestPage;
import com.ajita_flipkart.page.ProductdetailsTestPage;
import com.ajita_flipkart.page.SelectfilterTestPage;
import com.ajita_flipkart.page.SelectproductTestPage;
import com.ajita_flipkart.page.ValidateTestPage;

public class OrderSteps {

	@Test
	public void orderSteps() throws InterruptedException {
		HomeTestPage home=new HomeTestPage();
		home.launchSite();
		home.closeLoginPopup();
		home.selectSection("Women","Sarees");
	
		SelectfilterTestPage filter=new SelectfilterTestPage();
		filter.filterByBrand();
		filter.filterByPrice("Price -- High to Low");
			
		SelectproductTestPage selectproduct=new SelectproductTestPage();
		selectproduct.selectProductName(0);
		selectproduct.enterPinCode();
		
 //	    ProductdetailsTestPage productdetails=new ProductdetailsTestPage();
 //		productdetails.verify_rating();
		
		ValidateTestPage check=new ValidateTestPage();
		check.clickViewDeatils();
		check.verifyFlipkartAssured();
		
	}
	
}
