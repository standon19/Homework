import java.util.Scanner;

public class Craps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		boolean invalid = true;
		boolean playagain = true;
		Scanner again = new Scanner(System.in);
		
		while (playagain)
		{
	System.out.println("Welcome to Craps \n\n");
		Scanner roller = new Scanner(System.in);
		
		System.out.println("Press Enter To Roll");
		roller.nextLine();
		int sum = dice1.rollDice() + dice2.rollDice();
			if (sum == 2 || sum == 12) 
			{System.out.println("You rolled " + sum + ". You Won!");
			while (invalid = true)
			{
			System.out.println("Would You Like To PLay Again? Type \"Yes\" or \"No\"");
			String yesno = again.nextLine();
				if (yesno.equals("Yes"))
				{playagain = true;
				invalid = false;}
				
				else if (yesno.equals("No"))
				{playagain = false;
				invalid = false;
				}
				else
				{System.out.println("Your Input Is Invalid. Please Try Again");
				yesno = again.nextLine();
				}
					
			}
			}
			
			else if (sum == 7 || sum == 11)
			{System.out.println("You rolled " + sum + ". You Lost!");
			
			while (invalid)
			{
			System.out.println("Would You Like To PLay Again? Type \"Yes\" or \"No\"");
			String yesno = again.nextLine();
				if (yesno.equals("Yes"))
				{playagain = true;
				invalid = false;}
				
				else if (yesno.equals("No"))
				{playagain = false;
				invalid = false;
				playagain = false;
				}
				else
				{System.out.println("Your Input Is Invalid. Please Try Again");
				yesno = again.nextLine();
				}
			}}	
			
		else
			{System.out.println("You rolled " + sum);
			int point = sum;
			int counter = 0; 
				while (counter != 1)
					{System.out.println("Press Enter To Roll Again");
					roller.nextLine();
					int sum2 = dice1.rollDice() + dice2.rollDice();
					System.out.println("You rolled " + sum2);
					if (sum2 == 7)
						{System.out.println("You Lost!");
						counter +=1;
						while (invalid)
						{
						System.out.println("Would You Like To PLay Again? Type \"Yes\" or \"No\"");
						String yesno = again.nextLine();
							if (yesno.equals("Yes"))
							{playagain = true;
							invalid = false;}
							
							else if (yesno.equals("No"))
							{playagain = false;
							invalid = false;
							playagain = false;
							}
							else
							{System.out.println("Your Input Is Invalid. Please Try Again");
							yesno = again.nextLine();
							}
								
						}}
					else if (sum2 == point)
						{System.out.println("You Won!");
						counter +=1;
						while (invalid)
						{
						System.out.println("Would You Like To PLay Again? Type \"Yes\" or \"No\"");
						String yesno = again.nextLine();
							if (yesno.equals("Yes"))
							{playagain = true;
							invalid = false;}
							
							else if (yesno.equals("No"))
							{playagain = false;
							invalid = false;
							playagain = false;
							}
							else
							{System.out.println("Your Input Is Invalid. Please Try Again");
							yesno = again.nextLine();
							}
								
						}}
			}
		
			
		}
	}}}


