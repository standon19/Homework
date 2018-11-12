import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettysburgAddress {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner file = new Scanner(new File ("GettysburgAddress.txt"));
		ArrayList<String> address = new ArrayList<String>();	
		
	while (file.hasNext())
	{
		address.add(file.next());
	}
		
		
		
		
String max = address.get(0);
double count = 0;
double lengthtotal = 0;
for (String num: address)
{
	count+=1;
	lengthtotal += num.length();
	
	if (max.length() < num.length())
	{
		max = num;
	}

}
System.out.println("The longest word in the address is \"" + max + "\".");			
System.out.println("The average word length in the address is " + lengthtotal/count + " characters.");
	}}
