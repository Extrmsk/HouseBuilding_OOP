package com.lemanov.house;

import apartment.Apartment;
import apartment.LivingApartment;
import apartment.TechnicalApartment;

public class Floor {
	
	private int number;
	private Apartment[] apartments;
	private static final int DEFAULT_APARTMENT_CAPACITY = 2;
	
	public Floor(int number, int apartOnFloor, NumberGenerator apartNumberGen) {
		this.number = number;
		
		this.apartments = new Apartment[apartOnFloor];
		this.apartments[0] = new TechnicalApartment(apartNumberGen.getNext());
		for (int i=1; i<apartOnFloor; i++) {
			apartments[i] = new LivingApartment(apartNumberGen.getNext(), DEFAULT_APARTMENT_CAPACITY);
		}
	}

	public LivingApartment getFreeApartment() {
		for (Apartment apartment : apartments) {
			if (apartment instanceof LivingApartment && apartment.isFree()) {
				return (LivingApartment) apartment;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		String result = "=========================\n";
		result += "Floor number " + number + "\n";
		result += "-------------------------\n"; 
		for (Apartment apartment : apartments) {
			result += apartment.toString() + "\n";
		}
		result += "=========================\n";
		return result;
	}

}
