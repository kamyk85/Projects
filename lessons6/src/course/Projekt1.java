package course;

import java.util.Scanner;

public class Projekt1 
{

	public static void main(String[] args) 
	{		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Czy planujesz imprezê? (Jeœli tak napisz true, jeœli nie - false)");
		boolean party = input.nextBoolean();
		
		System.out.println ("Podaj iloœæ posiadanego sera w gramach");
		int cheese = input.nextInt();
		
		System.out.println("Podaj iloœæ posiadanego mleka w litrach");
		int milk = input.nextInt();
		
		System.out.println("Podaj iloœæ posiadanych jajek w sztukach");
		int eggs = input.nextInt();
		
		int cheeseExpected = 700;
		int milkExpected = 200;
		int eggsExpected = 300;
		
		// SER
		
		if (cheese < cheeseExpected)
		{
			int cheeseNeed = cheeseExpected - cheese;
			System.out.println("Musisz dokupiæ " + cheeseNeed + " gram sera" );
		}
		else
		{
			System.out.println ("Masz wystarczaj¹co sera");
		}
		
		
		// MLEKO
		
		if (party && milk < (3*milkExpected))
		{
			int milkNeed = (3*milkExpected) - milk;
			System.out.println ("Musisz dokupiæ " + milkNeed + " litrów mleka");
		}
		else if (milk < milkExpected)
		{
			int milkNeed = milkExpected = milk;
			System.out.println ("Musisz dokupiæ " + milkNeed + " litrów mleka");
		}
		else
		{
			System.out.println("Masz wystarczaj¹co mleka");
		}
		
		
		// JAJKA
		
		if (party && eggs < (2 * eggsExpected))
		{
			int eggsNeed = (2 * eggsExpected) - eggs;
			System.out.println ("Musisz dokupiæ " + eggsNeed + " sztuk jajek");
		}
		else if (eggs < eggsExpected)
		{
			int eggsNeed = eggsExpected - eggs;
			System.out.println ("Musisz dokupiæ " + eggsNeed + " sztuk jajek");
		}
		else
		{
			System.out.println ("Masz wystarczaj¹co jajek");
		}
	}

}
