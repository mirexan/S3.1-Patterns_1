package level_02.concrete_products;

import level_02.abstract_products.Phone;

public class UsaPhone implements Phone {
	@Override
	public String formatPhoneNumber(String rawNumber) {
		String usaNumber = "+1 (";
		int rawLen = rawNumber.length();
		int j = 0;
		for (int i = 4; i < 17; i++) {
			if (i == 7) {
				usaNumber += ')';
			}
			else if (i == 8) {
				usaNumber += ' ';
			}
			else if (i == 12) {
				usaNumber += '-';
			}
			else {
				if (j >= rawLen){
					j = 0;
				}
				if (j < rawLen) {

					usaNumber += rawNumber.charAt(j);
					j++;
				}
			}
		}
		return usaNumber;
	}

}
