package inheritance;

//Java program to illustrate the
//concept of inheritance

/*
Inheritance
Inheritance is a mechanism in which one class acquires the properties (i.e. variables and methods) of another class.
Instead of recreating the common variables and methods in a new class, we use inheritance concept to inherit the properties from the earlier created class
Advantage: Code Re-usability to avoid duplication
Child class acquires the properties (variables and methods) of Parent class 
Child class uses extends keyword for inheriting the properties from parent class
Demonstrate a child class which inherits the properties from Parent Class - Demonstrate here
Child class can have specific properties (i.e. variables and methods) which are not available in the parent class
Object created for parent class can access the variables and methods that are created in parent class only. It cannot access the child class properties. 
Object created for child class which is inheriting the parent class can access the variables and methods of both parent class and child class.
'IS A' relationship
Example: Benz is a Car
Types of Inheritance:
There are 3 types of inheritance:
Single Inheritance - View here
Single level of hierarchy
Demonstrate using a practical program
Multilevel Inheritance - View here
Multiple levels of hierarchy
Demonstrate using a practical program
Hierarchical Inheritance - View here
Multiple class inheriting the same class
Demonstrate using a practical program
Multiple Inheritance and Hybrid Inheritance are not supported in Java - View here
Demonstrate the non possibility of Multiple Inheritance
Privatizing the data will stop the data from inheriting
Demonstrate 
 */

class Car {
	
	int wheels;
	int cost;
	String color;
	String model;
	
	public void startCar(){
		
		System.out.println("Starting "+model);
		
	}
	
	public void stopCar(){
		
		System.out.println("Stopping "+model);
		
	}

}


class Benz extends Car {
	
	String openTopWindowColor;
	
	public void autoGearModeOn(){
		
		System.out.println("Turning on the gear mode");
		
	}

}


public class inheritance1 {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.color = "red";
		car.cost = 800000;
		car.model = "swift";
		car.startCar();
		car.stopCar();
		
		Benz benz = new Benz();
		
		benz.color = "black";
		benz.cost = 3000000;
		benz.model = "Benz-A-Class";
		benz.openTopWindowColor = "white";
		benz.startCar();
		benz.autoGearModeOn();
		benz.stopCar();

	}

}














