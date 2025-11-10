package level_02.concrete_products;

import level_02.abstract_products.Phone;

public class SpainPhone implements Phone {
	@Override
	public String formatPhoneNumber(String rawNumber) {
		String spanishNumber = "+34 ";
		int rawLen = rawNumber.length();
		int j = 0;
		for (int i = 4; i < 16; i++) {
			if (i == 4 && (rawLen + 4) > 11) {
				spanishNumber += '6';
				j++;
			} else if (i == 7 || i == 10 || i == 13) {
				spanishNumber += ' ';
			} else {
				if (j < rawLen) {
					spanishNumber += rawNumber.charAt(j);
					j++;
				} else {
					j = 0;
				}
			}
		}
		return spanishNumber;
	}
}
