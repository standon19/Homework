import java.util.Scanner;

public class RollMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Roll dice = new Roll();
		Roll dice2 = new Roll();
		Roll dice3 = new Roll();
		Roll dice4 = new Roll();
	
		boolean doubles = false;

		while (doubles == false)
		{ int roll1 = dice.rollDice();
		int roll2 = dice2.rollDice();
			
			int rolls = roll1 + roll2;
		System.out.println("" + roll1 + " " + roll2 + " " + rolls);
		
		if (rolls >= 10)
				{
			doubles = true;
			int numrolls = dice.numRolls();
			System.out.println("Number of Rolls Before Doubles: "  + (numrolls - 1));
				}
		}
		System.out.println("\n");
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter a Target Value: ");
	int value = in.nextInt();
	int sum = 0;
	 if (value <= 12)
	 {
	
	 while (value != sum)
	 { int roll3 = dice3.rollDice();
	 int roll4 = dice4.rollDice();
	 sum = roll3 + roll4;
	System.out.println("" + roll3 + " " + roll4 + " " + sum);
	 
	 }
	 }
	 else
	 { System.out.println("Error: Invalid Input");
	 }
	 
	 if (value <= 12)
	 {
	 
	 int numberrolls = dice3.numRolls();
		System.out.println("Number of Rolls Before Target: "  + (numberrolls - 1));
	 }}}
		
