package pl.kaczanowscy.tomek.servlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContext;
import pl.kaczanowscy.tomek.model.Product;
import pl.kaczanowscy.tomek.product.service.ProductService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddProductServlet extends HttpServlet {

	private ProductService productService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		WebApplicationContext wac =
				WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		productService = (ProductService) wac.getBean("productService");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productName = req.getParameter("productName");
		Product product = new Product();
		product.setName(productName);
		productService.create(product);
	}
}
