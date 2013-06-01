package pl.kaczanowscy.tomek.service;

import org.springframework.stereotype.Service;
import pl.kaczanowscy.tomek.model.Product;

import java.util.Collection;
import java.util.HashSet;

@Service("productService")
public class InMemoryProductService implements ProductService {

	static int ID =1;

	Collection<Product> products = new HashSet<Product>();

	@Override
	public Collection<Product> getProducts() {
		return products;
	}

	@Override
	public void create(Product product) {
		product.setId(ID++);
		products.add(product);
	}

	@Override
	public Product getProduct(int productId) {
		for (Product product : products) {
			if (productId == product.getId()) {
				return product;
			}
		}
		return null;
	}

	@Override
	public Product getProductByName(String productName) {

		for (Product product : products) {
			if (productName.equals(product.getName())) {
				return product;
			}
		}
		return null;
	}
}
