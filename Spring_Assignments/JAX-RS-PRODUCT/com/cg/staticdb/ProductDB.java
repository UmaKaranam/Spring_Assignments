package com.cg.staticdb;

import java.util.HashMap;

import com.cg.beans.Product;

public class ProductDB {
	static HashMap<Integer, Product>ProductIdMap = getProductIdMap();
	static{
		if(ProductIdMap == null){
			ProductIdMap = new HashMap<Integer, Product>();
			Product indiaProduct = new Product(1, "pen", 10000);
			Product chinaProduct = new Product(4, "pencil", 20000);
			
			ProductIdMap.put(1, indiaProduct);
			ProductIdMap.put(4, chinaProduct);
		}
	}
	public static HashMap<Integer, Product> getProductIdMap() {
		return ProductIdMap;
	}
 
	
}
