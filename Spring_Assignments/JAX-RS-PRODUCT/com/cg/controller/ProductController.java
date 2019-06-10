package com.cg.controller;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cg.beans.Product;
import com.cg.dao.IProductDAO;
import com.cg.dao.ProductDAOImpl;

@Path("/products")
public class ProductController {
	IProductDAO dao;
	public ProductController(){
		dao = new ProductDAOImpl();
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product>getProduct(){
		List<Product>listOfProducts = dao.getAllProducts();
		return listOfProducts;
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Product addProduct( @FormParam("txtId") int txtId,
	@FormParam("txtName") String txtName,
	@FormParam("txtPrice") double txtPrice) {
		Product product = new Product();
		product.setId(txtId);
		product.setName(txtName);
		product.setPrice(txtPrice);
		System.out.println(product);
		return dao.addProduct(product);
	}
	
	

}
