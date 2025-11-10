package level_02.client;

import level_02.abstract_factory.ContactFactory;
import level_02.abstract_products.Address;
import level_02.abstract_products.Phone;

public class Contact {
	private Phone phone;
	private Address address;

	public Contact(ContactFactory factory){
		this.phone = factory.createPhone();
		this.address = factory.createAddress();
	}
	public String formatContact(){
		return "Address: " + address.formatAddress() + " | Phone :"
				+ phone.formatPhoneNumber();
	}
}
