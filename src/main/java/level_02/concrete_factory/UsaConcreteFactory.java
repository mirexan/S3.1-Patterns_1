package level_02.concrete_factory;

import level_02.abstract_factory.ContactFactory;
import level_02.abstract_products.Address;
import level_02.abstract_products.Phone;
import level_02.concrete_products.UsaAddress;
import level_02.concrete_products.UsaPhone;

public class UsaConcreteFactory implements ContactFactory {
	private String street;
	private String city;
	private String postal;
	private String rawNumber;

	public void UsaContactFactory(String street, String city, String postal, String rawNumber){
		this.street = street;
		this.city = city;
		this.postal = postal;
		this.rawNumber = rawNumber;
	}

	@Override
	public Phone createPhone(){
		return new UsaPhone();
	}
	@Override
	public Address createAddress(){
		return new UsaAddress();
	}
}
