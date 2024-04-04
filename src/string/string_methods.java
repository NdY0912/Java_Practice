package string;

public class string_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Nishant Yadav";
		String str2 = "Welcome all";
		String str3 = "Welcome all";
		String str4 = "Welcome";
		String str5 = "    Test ";
		
		

		System.out.println(str1.length());
		System.out.println(str1 + str2);
		System.out.println(str1 + " " + str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1.equals(str2)); //Everything should match even case senstivity 
		System.out.println(str1.equalsIgnoreCase(str2)); //Everything should match except case senstivity 
		System.out.println(str3.contains(str4)); //str3 should contain str4
		System.out.println(str1.substring(1,3)); //start from 0; 1 is included & 3 is excluded
		System.out.println(str1.substring(1)); //compleste string from index 1
		System.out.println(str1.replace("ant","ANT")); //words will be replaced
		System.out.println(str1.toUpperCase()); //words will be replaced to uppercase
		System.out.println(str1.toLowerCase()); //words will be replaced to lower case
		System.out.println(str5.trim()); //helps us to remove space from starting of string and after string not in between
		System.out.println(str1.charAt(1)); //get character at index 1
			
		

	}

}
