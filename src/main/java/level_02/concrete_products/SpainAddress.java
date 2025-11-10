package level_02.concrete_products;

import level_02.abstract_products.Address;

public class SpainAddress implements Address {
	@Override
	public String formatAddress(String street,String city, String postal){
		String spainAddress = "";
		spainAddress = String.join(", ",street,postal);
		spainAddress += String.join(" ",postal, city);
		return spainAddress;
	}
}
