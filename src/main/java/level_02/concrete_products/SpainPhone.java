package level_02.concrete_products;

import level_02.abstract_products.Phone;

public class SpainPhone implements Phone {
	private String rawNumber;
	public SpainPhone(String number) {
		this.rawNumber = number;
	}
	@Override
	public String formatPhoneNumber() {
		if (this.rawNumber == null || this.rawNumber.length() != 9)
			return "invalid number";
		String firstGroup = this.rawNumber.substring(0, 3);
		String secondGroup = this.rawNumber.substring(3, 5);
		String thirdGroup = this.rawNumber.substring(5, 7);
		String fourthGroup = this.rawNumber.substring(7, 9);
		firstGroup = "6" + firstGroup.substring(1);
		return String.format("+34 %s %s %s %s", firstGroup, secondGroup, thirdGroup, fourthGroup);
	}
}
