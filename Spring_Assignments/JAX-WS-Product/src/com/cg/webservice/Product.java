package com.cg.webservice;

import javax.jws.WebService;
@WebService(endpointInterface = "com.cg.webservice.ProductServer")
public class Product {
	public static String searchByName(String name){
	if (name.equals("Landline"))
		return "price is 5000.0";
	else
		return "Product does not exist";
	
	}

}
	
	 

