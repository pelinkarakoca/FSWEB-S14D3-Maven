package org.example.company;

public class Mitsubishi extends Car {
	public Mitsubishi(int cylinder, String name){
		super(cylinder, name);
	}

	@Override
	public String accelerate() {
		return ("Mitsubishi is accelerating");
	}

	@Override
	public String startEngine() {
		return ("Mitsubishi's engine is starting");
	}

	@Override
	public String brake() {
		return ("Mitsubishi is braking");
	}

}
