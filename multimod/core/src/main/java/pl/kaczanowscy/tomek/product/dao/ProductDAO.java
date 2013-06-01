package pl.kaczanowscy.tomek.product.dao;

import pl.kaczanowscy.tomek.model.Product;

import java.util.Collection;
import java.util.List;

public interface ProductDAO {
	Collection<Product> findAll();

	Long save(Product product);

	Collection<Product> findByNamePattern(String namePattern);
}
