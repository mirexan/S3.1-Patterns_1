package level_02;

import level_02.abstract_factory.ContactFactory;
import level_02.client.Contact;
import level_02.concrete_factory.SpainContactFactory;
import level_02.concrete_factory.UsaContactFactory;

public class Main {
	public static void main(String[] args) {
		ContactFactory spainFactory = new SpainContactFactory(
				"Carrer Major 34", "Barcelona", "08001", "123456789"
		);
		Contact contactSpain = new Contact(spainFactory);
		System.out.println(contactSpain.formatContact());

		ContactFactory usaFactory = new UsaContactFactory(
				" 154 5th Avenue", "New York", "NY 10001", "987654321"
		);
		Contact contactUSA = new Contact(usaFactory);
		System.out.println(contactUSA.formatContact());

	}
}
