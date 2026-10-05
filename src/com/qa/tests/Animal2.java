package com.qa.tests;

public class Animal2 {

	//Method Overloading(Compile time polymorphism)
	
	void sound() {
		
		System.out.println("An animal must make a sound");
	}
	
	void sound(String type) {
		
		System.out.println("Animal Sound:"+type);
	}
	
	
	static class Dog extends Animal2{
		
		@Override
		
		void sound(String type) {
			
			System.out.println("Dog barking is:"+type);
		}
		
		
	}
	
	public class Main{
		
		public static void main(String args[]) {
			
			Animal2 a = new Animal2();
			
			Dog d = new Dog();
			
			Animal2 poly = new Dog();
			
			
			a.sound();
			a.sound("generic");
			
			d.sound();
			d.sound("soft");
			
			
			poly.sound();
			poly.sound("loud");		
			
		}
		
		
		
	}
	
	
}
