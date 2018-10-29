
public class DiceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int[] counter = new int [13];
		int roll;
		for(int i = 0; i < 1000; i+= 1 )
		{ roll = dice1.rollDice() + dice2.rollDice();
		counter[roll] +=1;
		}
		
		System.out.println("2's:" + counter[2]);
		System.out.println("3's:" + counter[3]);
		System.out.println("4's:" + counter[4]);
		System.out.println("5's:" + counter[5]);
		System.out.println("6's:" + counter[6]);
		System.out.println("7's:" + counter[7]);
		System.out.println("8's:" + counter[8]);
		System.out.println("9's:" + counter[9]);
		System.out.println("10's:" + counter[10]);
		System.out.println("11's:" + counter[11]);
		System.out.println("12's:" + counter[12]);
		
	}

}
