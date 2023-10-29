package passwordGenerator;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Variables
		Scanner input = new Scanner(System.in);
		int passwordCount;
		int passwordSize;
		
		// Input
		System.out.print("Enter the number of passwords: ");
		passwordCount = input.nextInt();
		
		String[] passwordArray = new String[passwordCount];
		
		System.out.print("Enter the max size of passwords: ");
		passwordSize = input.nextInt();
		
		// Calculations
		for(int i = 0; i < passwordCount; i++)
		{
			String randomPassword = "";
			
			for(int j = 0; j < passwordSize; j++)
			{
					randomPassword += randomCharacter();
			}
		passwordArray[passwordCount - 1] = randomPassword;
		printArray(passwordArray);
		}
	}

	// Function for generating random Character
	static public char randomCharacter()
	{
		int randomNumber = (int)(Math.random() * 62);
		
		if(randomNumber <= 9)
		{
			return (char) (randomNumber + 48);
		}
		else if(randomNumber <= 35)
		{
			return  (char) (randomNumber + 55);
		}
		else if(randomNumber <= 61)
		{
			return (char) (randomNumber + 61);
		}
		return (char) -1;

	}
	
	// Function to print array of passwords
	static public void printArray(String[] printPasswords)
	{
		for(int i = 0; i < printPasswords.length; i++)
		{
			if(printPasswords[i]!= null)
			{
				System.out.println(printPasswords[i]);
			}
		}
	}
}
