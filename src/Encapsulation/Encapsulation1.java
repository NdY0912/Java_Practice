package Encapsulation;

public class Encapsulation1 {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.setBreed("Pug");
		dog1.setName("Lucy");
		dog1.setColor("Brown");
		
		dog1.getBreed();
		dog1.getName();
		dog1.getColor();
		
	
	}

}

class Dog{
	
	private String breed;
	private String name;
	private String color;
	
	public void setBreed(String breed) {
		
		this.breed = breed;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setColor(String color) {
		
		this.color = color;
		
	}
	
	public void getBreed() {
		
		System.out.println("The breed of the Dog is "+breed);
		
	}
	
	public void getName() {
		
		System.out.println("The name of the Dog is "+name);
		
	}
	
	public void getColor() {
		
		System.out.println("The color of the Dog is "+color);
		
	}
	

}