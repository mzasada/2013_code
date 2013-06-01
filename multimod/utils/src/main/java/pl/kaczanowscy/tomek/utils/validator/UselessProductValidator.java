package pl.kaczanowscy.tomek.utils.validator;

import org.springframework.stereotype.Component;
import pl.kaczanowscy.tomek.model.Product;

@Component
public class UselessProductValidator implements ProductValidator {
	@Override
	public boolean isValid(Product product) {
		return true;
	}
}
