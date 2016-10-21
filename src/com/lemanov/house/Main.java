package com.lemanov.house;

public class Main {

	public static void main(String[] args) {
		
		House house = new House(5,4);
		
		Owner owner1 = new Owner("Vasya.Pupkin");
		Owner owner2 = new Owner("Elena.Pupkia");
		Owner owner3 = new Owner("Maxim.Marcevich");
		Owner owner4 = new Owner("Egor.Lemanov");
		Owner owner5 = new Owner("Olga.Kachalova");
		Owner owner6 = new Owner("Vadim.Lemanov");
		Owner owner7 = new Owner("Denis.Kachalov");
		
		house.settle(owner1);
		house.settle(owner2);
		house.settle(owner3);
		house.settle(owner4);
		house.settle(owner5);
		house.settle(owner6);
		house.settle(owner7);
		
		System.out.println(house.toString());

	}

}
