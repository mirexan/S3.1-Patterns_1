package level_02.concrete_products;

import level_02.abstract_products.Phone;

public class SpainPhone implements Phone {
	private String rawNumber;
	public SpainPhone(String number) {
		this.rawNumber = number;
	}
	@Override
	public String formatPhoneNumber() {
		String spanishNumber = "+34 ";
		int rawLen = this.rawNumber.length();
		int j = 0;
		for (int i = 4; i < 16; i++) {
			if (i == 4 && (rawLen + 4) > 11) {
				spanishNumber += '6';
				j++;
			} else if (i == 7 || i == 10 || i == 13) {
				spanishNumber += ' ';
			} else {
				if (j < rawLen) {
					spanishNumber += this.rawNumber.charAt(j);
					j++;
				} else {
					j = 0;
				}
			}
		}
		return spanishNumber;
	}
}
