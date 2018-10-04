import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner in = new Scanner(System.in);
		
	System.out.println("What is your name?");
	String name = in.nextLine();
	
	System.out.println("What is your phone number (no dashes)?");
	String number = in.nextLine();
	
	String phoneDashed =  "(" + number.substring(0,3) + ")" + "-" + number.substring(4,6) + "-" + number.substring(7);
	System.out.printf("%20s %10s", name, number );
	
	
	
	
	
	
	
	
	
	}

}
