package Class;


	/*
	Class
Class is a template/blueprint which can be used for creating Objects
Example for Objects and Class - View here
Demonstrate creating Class and Objects - View code here
	
	*/



public class class1 {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();  //will create new object
		
		dog1.breed = "Dobermann";  //initialize variable
		dog1.name = "Ginger";
		dog1.color = "Black";
		dog1.bark();    //call methods
		dog1.eat();
		dog1.sleep();
		dog1.walk();
		dog1.run();
		
		Dog dog2 = new Dog();
		
		dog2.breed = "Pug";
		dog2.name = "Ruby";
		dog2.color = "Brown";
		dog2.bark();
		dog2.eat();
		dog2.sleep();
		dog2.walk();
		dog2.run();
		
		Dog dog3 = new Dog();
		
		dog3.breed = "Dalmatian";
		dog3.name = "Piper";
		dog3.color = "White";
		dog3.bark();
		dog3.eat();
		dog3.sleep();
		dog3.walk();
		dog3.run();
		
	}

}

class Dog{
	
	public String breed;
	public String name;
	public String color;
	
	public void bark() {
		
		System.out.println(breed+" is barking");
		
	}
	
	public void eat() {
		
		System.out.println(breed+" is eating");
		
	}
	
	public void sleep() {
		
		System.out.println(breed+" is sleeping");
		
	}
	
	public void walk() {
		
		System.out.println(breed+" is walking");
		
	}
	
	public void run() {
		
		System.out.println(breed+" is running");
		System.out.println("-------------------");
		
	}
	
	
}
