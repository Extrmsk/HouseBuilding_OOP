package staff;

import com.lemanov.house.Owner;
import apartment.Apartment;

public class Housemaid extends Owner implements Cleaner {

	public Housemaid(String name) {
		super(name);
	}

	@Override
	public void clean(Apartment apartment) {
		System.out.println("Cleaning apartment " + apartment.getNubmer());
		System.out.println("Cleaning finished by " + name);
	}

}
