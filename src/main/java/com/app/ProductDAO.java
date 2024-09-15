package com.app;

import java.util.List;

public interface ProductDAO {
	public List<Product> getAllProducts();
	
	public List<Product> getAllProducts(int firstResult, int maxResult);
	
	public List<Product> getProductByProductName(String productName);
	
	public List<Product> getProductByProductName(String productName, int firstResult, int maxResult);
}
