package com.lemanov.house;

import java.util.Arrays;

import apartment.LivingApartment;

public class House {
	
	private Floor[] floors;
	
	public House (int floorsCount, int appartOnFloor) {
		NumberGenerator apartNumGen = new NumberGenerator();
		floors = new Floor[floorsCount];
		for (int i=0; i<floorsCount; i++) {
			 floors[i] = new Floor(i+1,appartOnFloor, apartNumGen);
		}
		
	}

	public void settle(Owner owner) {
		for (Floor floor : floors) {
			LivingApartment apartment = floor.getFreeApartment();
			if (apartment != null) {
				apartment.addOwner(owner);
				break;
			}
		}
	}

	@Override
	public String toString() {
		String result = "House:\n";
		for (Floor floor : floors) {
			result += floor.toString() + "\n";
		}
		return result;
 	}

}
