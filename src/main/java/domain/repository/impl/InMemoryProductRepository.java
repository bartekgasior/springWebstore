package domain.repository.impl;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import domain.Product;
import domain.repository.ProductRepository;

@Repository
public class InMemoryProductRepository implements ProductRepository{
	
	private List<Product> listOfProducts = new ArrayList<Product>();
	
	public InMemoryProductRepository() {
		Product iphone = new Product("P1234", "iPhone", new BigDecimal(500));
		iphone.setDescription("4-calowy wyœwietlacz, 640x1136");
		iphone.setCategory("Smart Phone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);
		
		Product laptop = new Product("P1235", "Dell", new BigDecimal(700));
		laptop.setDescription("14-calowy laptop (czarny)");
		laptop.setCategory("Laptop");
		laptop.setManufacturer("Dell");
		laptop.setUnitsInStock(1000);
		
		Product tablet = new Product("P1236", "Nexus", new BigDecimal(300));
		tablet.setDescription("Google Nexus 7, 4-rdzeniowy procesor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Google");
		tablet.setUnitsInStock(1000);
		
		listOfProducts.add(iphone);
		listOfProducts.add(laptop);
		listOfProducts.add(tablet);
	}
	
	public List<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		for(Product product : listOfProducts) {
			if(product != null && product.getProductId() != null & product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		
		if(productById==null) {
			throw new IllegalArgumentException("Brak produktu o wskazanym id: " + productId);
		}
		return productById;
	}

	public List<Product> getProductsByCategory(String category){
		List<Product> productsByCategory = new ArrayList<Product>();
		for(Product product : listOfProducts) {
			if(category.equalsIgnoreCase(product.getCategory())) {
				productsByCategory.add(product);
			}
		}
		return productsByCategory;
	}
}
