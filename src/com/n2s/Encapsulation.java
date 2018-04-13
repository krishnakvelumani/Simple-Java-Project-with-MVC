package com.n2s;

public class Encapsulation {
	
	public static void main(String[] args) {
		
		Sample object1 = new Sample();
		object1.sms();
	}

}

class Sample{
	
	public void sms() {
		
		System.out.println("I'm inside SMS");

		Innersample obj = new Innersample();
		obj.message();
	}
	
private class Innersample{
	
	public void message() {
		
		System.out.println("I'm inside Message");
	}
}
}