package com.qa.tests2;

public class Animal4 {



		//Method Overloading(Compile time polymorphism)
		
		void sound() {
			
			System.out.println("An animal must make a sound");
		}
		
		void sound(String type) {
			
			System.out.println("Animal Sound:"+type);
		}
		
		
		static class Dog extends Animal4{
			
			@Override
			
			void sound(String type) {
				
				System.out.println("Dog barking is:"+type);
			}
			
			
		}
		
		public class Main{
			
			public static void main(String args[]) {
				
				Animal4 a = new Animal4();
				
				Dog d = new Dog();
				
				Animal4 poly = new Dog();
				
				
				a.sound();
				a.sound("generic");
				
				d.sound();
				d.sound("soft");
				
				
				poly.sound();
				poly.sound("loud");		
				
			}
			
			
			
		}
		
		
	}

	
	
	

