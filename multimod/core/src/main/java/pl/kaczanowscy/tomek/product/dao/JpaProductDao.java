package pl.kaczanowscy.tomek.product.dao;

import org.springframework.stereotype.Repository;
import pl.kaczanowscy.tomek.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Repository
public class JpaProductDao implements ProductDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Collection<Product> findAll() {
		Query query = em.createQuery("SELECT p FROM Product p");
		return (Collection<Product>) query.getResultList();
	}

	@Override
	public Long save(Product product) {
		em.persist(product);
		return product.getId();
	}

	@Override
	public Collection<Product> findByNamePattern(String namePattern) {
		Query query = em.createQuery("SELECT p FROM Product p WHERE p.name like :name");
		query.setParameter("name", namePattern);
		return (Collection<Product>) query.getResultList();
	}
}
