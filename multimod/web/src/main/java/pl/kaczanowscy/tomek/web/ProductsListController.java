package pl.kaczanowscy.tomek.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.kaczanowscy.tomek.model.Product;
import pl.kaczanowscy.tomek.product.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.List;

@Controller
public class ProductsListController {

	private final ProductService productService;

	@Autowired
	public ProductsListController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView show(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("products_list");
		Collection<Product> products = productService.getProducts();
		mav.addObject("products", products);
		return mav;
	}
}
