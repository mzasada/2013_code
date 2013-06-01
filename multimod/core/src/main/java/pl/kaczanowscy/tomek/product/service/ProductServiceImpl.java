package pl.kaczanowscy.tomek.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.kaczanowscy.tomek.model.Product;
import pl.kaczanowscy.tomek.product.dao.ProductDAO;

import java.util.Collection;

@Service("productService")
@Transactional("transactionManager")
public class ProductServiceImpl implements ProductService {

	private final ProductDAO productDAO;

	@Autowired
	public ProductServiceImpl(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public Collection<Product> getProducts() {
		return productDAO.findAll();
	}

	@Override
	public Collection<Product> findByNamePattern(String namePattern) {
		return productDAO.findByNamePattern(namePattern);
	}

	@Override
	public Long create(Product product) {
		return productDAO.save(product);
	}
}
