package pl.kaczanowscy.tomek.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.kaczanowscy.tomek.model.Product;
import pl.kaczanowscy.tomek.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;

@Controller
public class ProductsListController {

	private final ProductService productService;

	@Autowired
	public ProductsListController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/products")
	public ModelAndView show(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("products");
		Collection<Product> products = productService.getProducts();
		mav.addObject("products", products);
		return mav;
	}
}
