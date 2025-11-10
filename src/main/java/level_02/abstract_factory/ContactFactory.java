package level_02.abstract_factory;

import level_02.abstract_products.Address;
import level_02.abstract_products.Phone;

public interface ContactFactory {
	Phone createPhone();
	Address createAddress();
}
