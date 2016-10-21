package com.lemanov.house;

public class NumberGenerator {
	private int current;
	
	public NumberGenerator() {
		this.current = 1;
	}
	
	public int getNext() {
		int res = current;
		current++;
		return res;
	}

}
