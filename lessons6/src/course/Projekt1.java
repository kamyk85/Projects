package course;

import java.util.Scanner;

public class Projekt1 
{

	public static void main(String[] args) 
	{		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Czy planujesz imprez�? (Je�li tak napisz true, je�li nie - false)");
		boolean party = input.nextBoolean();
		
		System.out.println ("Podaj ilo�� posiadanego sera w gramach");
		int cheese = input.nextInt();
		
		System.out.println("Podaj ilo�� posiadanego mleka w litrach");
		int milk = input.nextInt();
		
		System.out.println("Podaj ilo�� posiadanych jajek w sztukach");
		int eggs = input.nextInt();
		
		int cheeseExpected = 700;
		int milkExpected = 200;
		int eggsExpected = 300;
		
		// SER
		
		if (cheese < cheeseExpected)
		{
			int cheeseNeed = cheeseExpected - cheese;
			System.out.println("Musisz dokupi� " + cheeseNeed + " gram sera" );
		}
		else
		{
			System.out.println ("Masz wystarczaj�co sera");
		}
		
		
		// MLEKO
		
		if (party && milk < (3*milkExpected))
		{
			int milkNeed = (3*milkExpected) - milk;
			System.out.println ("Musisz dokupi� " + milkNeed + " litr�w mleka");
		}
		else if (milk < milkExpected)
		{
			int milkNeed = milkExpected = milk;
			System.out.println ("Musisz dokupi� " + milkNeed + " litr�w mleka");
		}
		else
		{
			System.out.println("Masz wystarczaj�co mleka");
		}
		
		
		// JAJKA
		
		if (party && eggs < (2 * eggsExpected))
		{
			int eggsNeed = (2 * eggsExpected) - eggs;
			System.out.println ("Musisz dokupi� " + eggsNeed + " sztuk jajek");
		}
		else if (eggs < eggsExpected)
		{
			int eggsNeed = eggsExpected - eggs;
			System.out.println ("Musisz dokupi� " + eggsNeed + " sztuk jajek");
		}
		else
		{
			System.out.println ("Masz wystarczaj�co jajek");
		}
	}

}
