package week14;
import java.util.Scanner;

public class TestDiceCard {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		randomNumberInterface [] interfaceObject = new randomNumberInterface[10];
		interfaceObject[0] = new dice();
		interfaceObject[1] = new card();
		
		for( int arrayCount = 1; arrayCount <=10; arrayCount++)
		{
			System.out.print("Press 1 to role a Dice, or 2 to pick a Card: ");
			int userChoice = input.nextInt();
			
			try
			{
				if(userChoice == 1)
				{
					int randomDiceNumber = interfaceObject[0].getRandomNumber();
					System.out.println("Random Dice number = " + randomDiceNumber);
					interfaceObject[0].setNumberHistory(randomDiceNumber);
				}
				else if (userChoice == 2)
				{
					int randomCardNumber = interfaceObject[0].getRandomNumber();
					System.out.println("Random Card number = " + randomCardNumber);
					interfaceObject[1].setNumberHistory(randomCardNumber);
				}
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("Random number can only be generated and stored 10 times.");
			}
		}
		System.out.println("\nArray Dice #");
		for (int count = 0; count <= 9; count++)
		{
			System.out.printf("%d  ", count);
			System.out.println(interfaceObject[0].getHistory(count));
		}
		
		System.out.println("\nArray Card #");
		for(int count = 0; count <= 9; count++)
		{
			System.out.printf("%d  ", count);
			System.out.println(interfaceObject[1].getHistory(count));
		}
		input.close();
	}
}
