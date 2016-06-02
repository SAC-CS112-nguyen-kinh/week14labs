package week14;

public class card  implements randomNumberInterface
{
	private int randomNumberHistory[] = new int [10];
	private int arrayCount = 0;
	
	@Override
	public int getRandomNumber()
	{
		if (arrayCount >= 10)
			throw new IllegalArgumentException("System can only hold 10 spaces.");
		int randomNumber = 1 + (int)(Math.random()* 6);
		return randomNumber;
	}
	@Override
	public void setNumberHistory (int n)
	{
		randomNumberHistory [arrayCount] = n;
		arrayCount++;
	}
	@Override
	public int getHistory (int count)
	{
		return randomNumberHistory[count];	
	}
}

