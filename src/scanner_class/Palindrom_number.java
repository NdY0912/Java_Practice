package scanner_class;
import java.util.Scanner;

public class Palindrom_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");

		int n = sc.nextInt();
		while (n>0)
		{
			int r;
			r = n%10;
			n = n/10;			
			System.out.println(n);

			
		}
}
}
