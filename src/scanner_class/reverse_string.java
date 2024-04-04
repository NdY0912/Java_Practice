package scanner_class;
import java.util.Scanner;


public class reverse_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");

		String str1 = sc.nextLine();
		int i = str1.length();
		System.out.println(i);
		String rev = "";
		for (int j=str1.length()-1; j>=0; j--)
		{
			rev = rev + str1.charAt(j);		
			//System.out.println(rev);

		}
		System.out.println(rev);
		if (str1.equalsIgnoreCase(str1))
		{
			System.out.println("Palindrom");

		}
		
		else
		{
			
			System.out.println("Not Palindrom");

		}
		
		
		
		
		
		
		
		
		
		

	}

}
