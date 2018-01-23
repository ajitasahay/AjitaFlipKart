package com.ajita_flipkart.common_utils;

import java.util.HashMap;

import com.ajita_flipkart.details.Product_Details;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriver;

public class Utils {
	public static void setProductItem(HashMap<String, Product_Details> ProductList)
	{
		ConfigurationManager.getBundle().addProperty("Product.information",ProductList);
	}
	
	
	@SuppressWarnings("unchecked")
	
	public static HashMap<String, Product_Details> getProductList()
	{
		HashMap<String, Product_Details> ProductList;
		if(ConfigurationManager.getBundle().containsKey("Product.information"))
		{
			ProductList=((HashMap<String,Product_Details>) ConfigurationManager.getBundle().getProperty("product.information"));

		}
		else
		{
			ProductList= new HashMap<String,Product_Details>();
			ConfigurationManager.getBundle().addProperty("product.information", ProductList);
		}
		return ProductList;
	}
	public static void switchToWindow(QAFWebDriver driver)
	{
		for(String handle: driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
	}
	
	
}
