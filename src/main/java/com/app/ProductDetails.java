package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDetails {
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> getAllProductDetails(){
		List<Product> productList = productDAO.getAllProducts();
		return productList;
	}
	
	public List<Product> getAllProductDetails(int firstResult, int maxResult){
		List<Product> productList = productDAO.getAllProducts(firstResult, maxResult);
		return productList;
	}
	
	public List<Product> getProductDetailsByProductName(String productName){
		List<Product> productList = productDAO.getProductByProductName(productName);
		return productList;
	}
	
	public List<Product> getProductByProductName(String productName, int firstResult, int maxResult) {
		List<Product> productList = productDAO.getProductByProductName(productName, firstResult, maxResult);
		return productList;
	}
}
