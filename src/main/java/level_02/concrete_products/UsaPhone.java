package level_02.concrete_products;

import level_02.abstract_products.Phone;

public class UsaPhone implements Phone {
	private String rawNumber;
	public UsaPhone(String rawNumber) {
		this.rawNumber = rawNumber;
	}
	@Override
	public String formatPhoneNumber() {
		if (this.rawNumber == null || this.rawNumber.length() != 9)
			return "invalid number";
		String areaCode = this.rawNumber.substring(0,2);
		String prefix = this.rawNumber.substring(2,5);
		String code = this.rawNumber.substring(5,9);
		return String.format("+1 (0%s) %s %s", areaCode,prefix,code);
	}

}
