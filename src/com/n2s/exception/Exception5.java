package com.n2s.exception;

public class Exception5 {

	public static void main(String[] args) throws InvalidStringException {
		try{
			Exception5 e = new Exception5();
			e.display("Krishna");
		}
		catch(InvalidStringException e2){
			System.out.println(e2);
		}
		System.out.println("Print is complete");
	}
	
	public void display(String s) throws InvalidStringException {
	if (s.equals("Krishna"))
		throw new InvalidStringException("Invalid name");
	else
		System.out.println("Correct name");
	}
}
