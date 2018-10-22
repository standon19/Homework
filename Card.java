
public class Card {

	//fields
	

	boolean ace;
	int cardNum;
	int suitnum;
	String suit;
	//
	
	public Card()
	{
		suitnum = (int) (Math.random()*4 + 1);
		if (suitnum == 1)
		{suit = "spades";}
		else if (suitnum == 2)
		{suit = "hearts";}
		else if (suitnum == 3)
		{suit = "diamonds";}
		else if (suitnum == 4)
		{suit = "clubs";}
		
		cardNum = (int) (Math.random()*10 + 1);
		if (cardNum == 1)
		{ace = true;}
		else
		{ace = false;}
	
		
	}
	
}
