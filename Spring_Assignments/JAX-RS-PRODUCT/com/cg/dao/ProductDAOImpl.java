package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.beans.Product;
import com.cg.staticdb.ProductDB;

public class ProductDAOImpl implements IProductDAO{
	static HashMap<Integer, Product >ProductIdMap = ProductDB.getProductIdMap();

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> countries = new ArrayList<Product>(ProductIdMap.values());
		return countries;
	}

	@Override
	public Product addProduct(Product Product) {
		// TODO Auto-generated method stub
		ProductIdMap.put(Product.getId(), Product);
		return Product;
	}

}
