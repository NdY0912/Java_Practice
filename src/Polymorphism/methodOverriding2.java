package Polymorphism;

class ClassA {
	
	public void methodOne(int a,int b){
		
		int sum = a+b;
		System.out.println("The sum is "+sum);
		
	}

}


class ClassB extends ClassA {
	
	public void methodOne(int a,int b){
		
		int sub = a-b;
		System.out.println("The subtraction is "+sub);
		
	}

}



public class methodOverriding2 {

	public static void main(String[] args) {
		
		ClassA classa = new ClassA();
		
		classa.methodOne(10, 5);
		
		ClassB classb = new ClassB();
		
		classb.methodOne(10, 5);
		
		
	}

}

