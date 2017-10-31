package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Product;
import domain.repository.ProductRepository;
import service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public void processOrder(String productId, int count) {
		Product productById = productRepository.getProductById(productId);
		if(productById.getUnitsInStock() < count) {
			throw new IllegalArgumentException("Zbyt ma³o towaru. Obecna liczba szytk w magazynie: " + productById.getUnitsInStock());
		}
		productById.setUnitsInStock(productById.getUnitsInStock() - count);
	}
}
