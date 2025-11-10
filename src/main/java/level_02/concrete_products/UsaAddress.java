package level_02.concrete_products;

import level_02.abstract_products.Address;

public class UsaAddress implements Address {
	private String street;
	private String city;
	private String postal;
	public UsaAddress(String street,String city,String postal) {
		this.street = street;
		this.city = city;
		this.postal = postal;
	}
	@Override
	public String formatAddress(){
		return String.format("%s, %s, %s", this.street, this.city, this.postal);
	}
}
