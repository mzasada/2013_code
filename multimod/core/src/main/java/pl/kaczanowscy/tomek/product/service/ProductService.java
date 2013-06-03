package pl.kaczanowscy.tomek.product.service;

import pl.kaczanowscy.tomek.model.Product;

import java.util.Collection;

public interface ProductService {

	Collection<Product> getProducts();

	/**
	 * Returns products which by name doing "ilike" comparison.
	 * E.g. for namePatter="pro" products with name "product" and "ibuprom" will be returned.
	 * @param namePattern
	 * @return
	 */
	Collection<Product> findByNamePattern(String namePattern);

	Long create(Product product);
}
