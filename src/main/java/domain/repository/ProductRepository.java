package domain.repository;

import java.util.List;

import domain.Product;

public interface ProductRepository {
	List <Product> getAllProducts();
	Product getProductById(String productId);
	List <Product> getProductsByCategory(String category);
}
