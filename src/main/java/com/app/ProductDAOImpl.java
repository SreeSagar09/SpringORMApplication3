package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> getAllProducts() {
		Product product = new Product();
		List<Product> productList = hibernateTemplate.findByExample(product);
		return productList;
	}
	
	@Override
	public List<Product> getAllProducts(int firstResult, int maxResult) {
		Product product = new Product();
		List<Product> productList = hibernateTemplate.findByExample(product, firstResult, maxResult);
		return productList;
	}

	@Override
	public List<Product> getProductByProductName(String productName) {
		Product product = new Product();
		product.setProductName(productName);
		List<Product> productList = hibernateTemplate.findByExample("com.app.Product", product);
		return productList;
	}

	@Override
	public List<Product> getProductByProductName(String productName, int firstResult, int maxResult) {
		Product product = new Product();
		product.setProductName(productName);
		List<Product> productList = hibernateTemplate.findByExample("com.app.Product", product, firstResult, maxResult);
		return productList;
	}

}
