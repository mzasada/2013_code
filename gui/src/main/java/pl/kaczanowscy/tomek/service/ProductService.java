package pl.kaczanowscy.tomek.service;

import pl.kaczanowscy.tomek.model.Product;

import java.util.Collection;

public interface ProductService {
	Collection<Product> getProducts();

	void create(Product product);

	Product getProduct(int productId);

	Product getProductByName(String productName);
}
