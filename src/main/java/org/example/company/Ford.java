package org.example.company;

public class Ford extends Car {
	public Ford(int cylinder, String name){
		super(cylinder, name);
	}

	@Override
	public String accelerate() {
		return ("the ford is accelerating");
	}

	@Override
	public String startEngine() {
		return ("Ford's engine is starting");
	}

	@Override
	public String brake() {
		return ("Ford is braking");
	}
}

