package com.lemanov.house;

import staff.Housemaid;
import staff.RoboCleaner;

public class Main {

	public static void main(String[] args) {
		
		House house = new House(8,2);
		
		Owner owner1 = new Owner("Vasya.Pupkin");
		Owner owner2 = new Owner("Elena.Pupkia");
		Owner owner3 = new Owner("Maxim.Marcevich");
		Owner owner4 = new Owner("Egor.Lemanov");
		Owner owner5 = new Owner("Olga.Kachalova");
		Owner owner6 = new Owner("Vadim.Lemanov");
		Owner owner7 = new Owner("Denis.Kachalov");
		Owner owner8 = new Owner("Mister.X");
		
		Housemaid housemaid = new Housemaid("Fracken.Bock");
		house.addCleaner(housemaid);
		house.addCleaner(housemaid);
		house.addCleaner(new RoboCleaner("robot1"));
		house.addCleaner(new RoboCleaner("robot2"));
		house.addCleaner(new RoboCleaner("robot3"));
		house.addCleaner(new RoboCleaner("robot4"));
		house.addCleaner(new RoboCleaner("robot5"));
		house.addCleaner(new RoboCleaner("robot6"));
		
		house.settle(owner1);
		house.settle(owner2);
		house.settle(owner3);
		house.settle(owner4);
		house.settle(owner5);
		house.settle(housemaid);
		house.settle(owner6);
		house.settle(owner7);
		house.settle(owner8);
		
		System.out.println(house.toString());

	}

}
