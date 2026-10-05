package com.qa.tests;

public class PolyMorphism {

	
	class MathUtils{
		//compile-time Polymorphism (Method Overloading)
		int add(int a, int b) { return a+b; }
		
		double add (double a, double b) { return a+b;}
		
	}
	
	class SoundAnimal{
		void makeSound() {
			
			System.out.println("Some animal sound");
		}
		
	}
	
	class Cat extends SoundAnimal{
		//Run-time polymorphism (Method Overriding)
		
		
		void makeSound() {
			
			System.out.println("meow");
		}
			
		
	}
	
	public class Main4{
		
		MathUtils obj= new MathUtils();
		obj.add(6,2);
		
		
		
		
		
		
	}
}
