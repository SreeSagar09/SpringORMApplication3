package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.Product;
import com.app.ProductDetails;
import com.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductDetails productDetails = applicationContext.getBean(ProductDetails.class);
		
		System.out.println("--------- All Product List --------");
		List<Product> productList1 = productDetails.getAllProductDetails();
		productList1.forEach(p->{System.out.println(p);});
		
		System.out.println("-------- Product List by FirstResult, MaxResult -------");
		List<Product> productList2 = productDetails.getAllProductDetails(2, 1);
		productList2.forEach(p->{System.out.println(p);});
		
		System.out.println("------- Product List by ProductName --------");
		List<Product> productList3 = productDetails.getProductDetailsByProductName("Book");
		productList3.forEach(p->{System.out.println(p);});
		
		System.out.println("------- Product List by ProductName, FirstResult and MaxResult------");
		List<Product> productList4 = productDetails.getProductByProductName("Pen", 0, 2);
		productList4.forEach(p->{System.out.println(p);});
	}
}
