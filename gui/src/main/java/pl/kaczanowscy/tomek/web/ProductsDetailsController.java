package pl.kaczanowscy.tomek.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.kaczanowscy.tomek.model.Product;
import pl.kaczanowscy.tomek.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

@Controller
public class ProductsDetailsController {

	private final ProductService productService;

	@Autowired
	public ProductsDetailsController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/productDetails/{productId}")
	public ModelAndView show(@PathVariable(value = "productId") String productId, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("product_details");
		Product product = productService.getProduct(Integer.parseInt(productId));
		mav.addObject("product", product);
		return mav;
	}
}
