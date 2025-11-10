package level_02.concrete_products;

import level_02.abstract_products.Address;

public class UsaAddress implements Address {
	@Override
	public String formatAddress(String street,String city, String postal){
		String usaAddress = "";
		usaAddress = String.join(", ",street,city);
		usaAddress += String.join(" ",postal, postal);
		return usaAddress;
	}
}
