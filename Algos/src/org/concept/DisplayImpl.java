package org.concept;

public class DisplayImpl extends Display {
	
	public DisplayImpl() {
		super();
		System.out.println("Hi i am in construct");
	}

	@Override
	public void display() {

		System.out.println("Hi i am in display");
	}

}
