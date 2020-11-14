package course;

import java.util.Scanner;

public class Projekt2 
{

	public static void main(String[] args) 
	{		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Are you going to go on holidays? (if YES write true, if not - false)");
		boolean holiday = input.nextBoolean();
		
		System.out.println ("How much of washing powder do you have (in kg) ?");
		int washing = input.nextInt();
		
		System.out.println("How much shampoo do you have (in ml) ?");
		int shampoo = input.nextInt();
		
		System.out.println("How many soaps do you have (in pcs) ?");
		int soap = input.nextInt();
		
		int washingExpected = 10;
		int shampooExpected = 1000;
		int soapExpected = 6;
		
		// washing powder
		
		if (washing < washingExpected)
		{
			int washingNeed = washingExpected - washing;
			System.out.println("You need to buy " + washingNeed + " kg of washing powder" );
		}
		else
		{
			System.out.println ("You have enough washing powder");
		}
		
		
		// Shampoo
		
		if (holiday && shampoo < (shampooExpected/2))
		{
			int shampooNeed = (shampooExpected/2) - shampoo;
			System.out.println ("You need to buy " + shampooNeed + " ml of shampoo");
		}
		else if (!(holiday) && shampoo < shampooExpected)
		{
			int shampooNeed = shampooExpected -shampoo;
			System.out.println ("You need to buy " + shampooNeed + " ml of shampoo");
		}
		else
		{
			System.out.println("You have enough shampoo");
		}
		
		
		// soap
		
		if (holiday && soap < (soapExpected/2))
		{
			int soapNeed = (soapExpected/2) - soap;
			System.out.println ("You need to buy " + soapNeed + " pcs of soap");
		}
		else if (!(holiday) && soap < soapExpected)
		{
			int soapNeed = soapExpected - soap;
			System.out.println ("You need to buy " + soapNeed + " pcs of soap");
		}
		else
		{
			System.out.println ("You have enough soaps");
		}
	}

}
