package scanner_class;
import java.util.Scanner;

public class Taking_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Taking input of string");
	
		//int a = sc.nextInt();
		String str1 = sc.nextLine();//only reads 1 word
		System.out.println(str1);
		
		
		String str2 = sc.next();
		System.out.println(str2);

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Taking input of A");

		int a = sc2.nextInt();
		System.out.println("Taking input of B");
		int b = sc2.nextInt();
		int sum = a + b;
		System.out.println(sum);
		
	//	String str2 = sc.nextLine();
		//System.out.println(str2);
	}

}
