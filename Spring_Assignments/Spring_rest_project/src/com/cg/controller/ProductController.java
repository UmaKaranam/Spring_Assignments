package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.beans.Product;
import com.cg.beans.ProductV1;
import com.cg.dao.IProductDao;


@CrossOrigin(origins = "http://localhost:8086")
@RestController
public class ProductController {

	@Autowired
	IProductDao dao;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(Model model){
		return dao.getAllProducts();
	}
	@PostMapping(value = "/products")
	public List<Product> createProduct(
			@RequestParam int txtId,
			@RequestParam String txtName,
			@RequestParam int txtPrice, ModelAndView model) {
		Product product = new Product();
		product.setId(txtId);
		product.setName(txtName);
		product.setPrice(txtPrice);
		
		
		dao.addProduct(product);
		
		return dao.getAllProducts();
	}
		@ResponseStatus
		(value = HttpStatus.NOT_FOUND,
		reason = "product with this id not present")
		@ExceptionHandler({Exception.class})
		public void handleException() {
		
		
		
	}
		@GetMapping("products/search/{txtId}")
		public Product getProductById(@PathVariable int txtId){
			return dao.getProduct(txtId);
		}
		@GetMapping("/v1/products")
		public List<ProductV1>getAllProductsV1(Model model){
			return dao.getAllProductsV1();
		}
}
