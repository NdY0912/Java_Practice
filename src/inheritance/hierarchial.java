package inheritance;


class Animall{  
	void eat(){
		System.out.println("eating...");
	}  
}  
class Dogg extends Animall{  
	void bark(){
		System.out.println("barking...");
	}  
}  
class Cat extends Animall{  
	void meow(){
		System.out.println("meowing...");
	}  
}  
class hierarchial{  
	
	public static void main(String args[]){  
				Cat c=new Cat();  
				c.meow();  
				c.eat();  
				//c.bark();//C.T.Error  
}}  