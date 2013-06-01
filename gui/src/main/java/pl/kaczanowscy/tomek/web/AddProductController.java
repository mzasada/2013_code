package pl.kaczanowscy.tomek.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
import pl.kaczanowscy.tomek.model.Product;
import pl.kaczanowscy.tomek.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class AddProductController {

	private final ProductService productService;

	@Autowired
	public AddProductController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public ModelAndView show(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("add_product");
		return mav;
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public View submit(@Valid Product product, HttpServletRequest request, HttpServletResponse response) {
		productService.create(product);
		return new RedirectView("productDetails/" + product.getId());
	}
}
