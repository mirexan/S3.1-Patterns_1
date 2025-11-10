package level_02.concrete_products;

import level_02.abstract_products.Phone;

public class UsaPhone implements Phone {
	private String rawNumber;
	public UsaPhone(String rawNumber) {
		this.rawNumber = rawNumber;
	}
	@Override
	public String formatPhoneNumber() {
		String usaNumber = "+1 (";
		int rawLen = this.rawNumber.length();
		int j = 0;
		for (int i = 4; i < 17; i++) {
			if (i == 7) {
				usaNumber += ')';
			} else if (i == 4) {
				usaNumber += '0';
			} else if (i == 8) {
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

					usaNumber += this.rawNumber.charAt(j);
					j++;
				}
			}
		}
		return usaNumber;
	}

}
