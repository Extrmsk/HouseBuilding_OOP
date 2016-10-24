package com.lemanov.house;

import java.util.Arrays;

import apartment.LivingApartment;
import staff.Cleaner;
import staff.Housemaid;

public class House {
	
	private Floor[] floors;
	private Cleaner[] cleaners;
	
	public House (int floorsCount, int appartOnFloor) {
		NumberGenerator apartNumGen = new NumberGenerator();
		cleaners = new Cleaner[floorsCount];
		floors = new Floor[floorsCount];
		for (int i=0; i<floorsCount; i++) {
			 floors[i] = new Floor(i+1,appartOnFloor, apartNumGen);
		}
		
	}

	public void settle(Owner owner) {
		System.out.println("Trying to settle " + owner.toString() + "\n");
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

	public void addCleaner(Cleaner cleaner) {
		int floor = nextCleanerPlace();
		this.cleaners[floor] = cleaner;
		this.floors[floor].setCleaner(cleaner);
	}

	private int nextCleanerPlace() {
		for (int i = 0; i < cleaners.length; i++) {
			if (cleaners[i] == null) {
				return i;
			}
		}
		throw new RuntimeException("No place for new cleaner");
	}

}
