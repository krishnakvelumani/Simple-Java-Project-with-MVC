package com.n2s;

public class IF_sample implements IF1,IF2 {

	public static void main(String[] args) {
		IF_sample obj=new IF_sample();
		obj.add();
		obj.sub();
	}
	@Override
	public int sub() {
		
		
		System.out.println(IF2_j-IF1_i);
		return 0;
	}

	@Override
	public int add() {
		System.out.println(IF2_j+IF1_i);
		return 0;
	}

}
