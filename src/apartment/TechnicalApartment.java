package apartment;

import java.util.Arrays;

import equipment.Bucket;
import equipment.Equipment;
import equipment.Extingisher;
import equipment.Swob;

public class TechnicalApartment extends Apartment {
	
	private Equipment[] equipments;

	public TechnicalApartment(int number) {
		super(number);
		equipments = new Equipment[10];
		equipments[0] = new Extingisher();
		equipments[1] = new Bucket();
		equipments[2] = new Swob(); 
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "With objects " + Arrays.toString(equipments);
	}
	
	

}
