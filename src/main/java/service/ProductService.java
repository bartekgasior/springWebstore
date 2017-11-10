package service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import domain.Product;

public interface ProductService {
	List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	Product getProductById(String id);
	void addProduct(Product product);
}
