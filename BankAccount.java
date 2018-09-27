
public class BankAccount {

	//instance variables
	
	private String name;
	private int accNum;
	private int balance;
	
	//constructors
	
	public BankAccount(String accountHolder, int accountNumber)
	{
		name = accountHolder;
		accNum = accountNumber;
		balance = 0;
		
	}
	
	public BankAccount(String accountholder, int accountnumber, int currentBalance)
	{
		name = accountholder;
		accNum = accountnumber;
		balance = currentBalance;
	}
	
	public void deposit(int depositAmount)
	{
		balance = balance + depositAmount;
	}
	
	public void withdraw(int withdrawAmount)
	{
		balance = balance - withdrawAmount;
	}
	
	public int getBalance()
	{
		return balance;
	}

	public String toString()
	{
		return "The balance in account # " + accNum + " under the name " + name + " is " + balance + ".";

}
}