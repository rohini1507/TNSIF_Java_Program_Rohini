package com.tnsif.nonaccessmodifiers;

class FinalDemo {
	
	final int Max = 100;
	
	void display() {
		System.out.println("show the value of max: "+Max);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		final int Max = 200;

	}

}

 class child extends FinalDemo{
	 void display() {
		System.out.println("show the value of max: "+Max);
	}
}

